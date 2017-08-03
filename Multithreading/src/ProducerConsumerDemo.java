import java.lang.Thread.State;
import java.util.LinkedList;
import java.util.Queue;

/** * Producer Thread will keep producing values for Consumer 
 * * to consumer. It will use wait() method when Queue is full 
 * * and use notify() method to send notification to Consumer 
 * * Thread.
 * */

class producer implements Runnable{
	
	private Queue<Integer>queue;
	private int max_size;

	
	public producer(Queue<Integer> queue, int max_size) {
		this.queue = queue;
		this.max_size = max_size;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int value = 0;
		while (true) {
			synchronized (queue) {
				while (queue.size() == max_size) {
					try {
						System.out .println("Queue is full, " + "Producer thread waiting for " 
											+ "consumer to take something from queue");
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				queue.add(value++);
				queue.notify();
			}
		}
	}
}

/** * Consumer Thread will consumer values form shared queue. 
 * * It will also use wait() method to wait if queue is 
 * * empty. It will also use notify method to send 
 * * notification to producer thread after consuming values 
 * * from queue.
 * */
class Consumer implements Runnable{
	private Queue<Integer>queue;
	private int max_size;
	
	
	
	public Consumer(Queue<Integer> queue, int max_size) {
		this.queue = queue;
		this.max_size = max_size;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty," + "Consumer thread is waiting" + " for producer thread to put something in queue");
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println("Consuming value : " + queue.remove());
				queue.notify();
				
			}
			
		}
		
	}
	
}


public class ProducerConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("How to use wait and notify method in Java"); 
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> queue = new LinkedList<>();
		int max_size = 5;
		
		producer producer = new producer(queue, max_size);
		Consumer consumer = new Consumer(queue, max_size);
		
		Thread t1 = new Thread(producer, "Producer");
		Thread t2 = new Thread(consumer, "Consumer");
		
		t1.start();
		t2.start();
		
	}

}

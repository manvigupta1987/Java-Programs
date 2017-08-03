import java.util.concurrent.CountDownLatch;

class Worker extends Thread{
	private CountDownLatch latch;
	private int delay;
	
	
	public Worker( int delay, CountDownLatch latch, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.latch = latch;
		this.delay = delay;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(delay);
			latch.countDown();
			System.out.println(Thread.currentThread().getName() + " has finished");
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		CountDownLatch latch = new CountDownLatch(4);
		Worker first = new Worker(1000, latch, "WORKER-1");
        Worker second = new Worker(2000, latch, "WORKER-2");
        Worker third = new Worker(3000, latch, "WORKER-3");
        Worker fourth = new Worker(4000, latch, "WORKER-4");
        
        first.start();
        second.start();
        third.start();
        fourth.start();
        
        latch.await();
        
        System.out.println(Thread.currentThread().getName() + "has finished");     
        

	}

}

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerDemoMain {
	public static void main(String[] args) {
		
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread prodThread = new Thread(producer);
		Thread consThread = new Thread(consumer);
		
		prodThread.start();
		consThread.start();
		
	}
}

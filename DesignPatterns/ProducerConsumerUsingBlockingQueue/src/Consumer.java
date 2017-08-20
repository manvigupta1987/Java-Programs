import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable {
	
	private final BlockingQueue queue;
	
	public Consumer(BlockingQueue queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
			try {
				System.out.println("Consumed: " + queue.take());
			}catch (InterruptedException ex) {
				// TODO: handle exception'
				Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

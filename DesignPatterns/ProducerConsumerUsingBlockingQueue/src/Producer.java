import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable {
	
	private final BlockingQueue queue;
	
	public Producer(BlockingQueue queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<10;i++) {
			try {
				System.out.println("Produced: " + i);
				queue.put(i);
			}catch (InterruptedException ex) {
				// TODO: handle exception'
				Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}

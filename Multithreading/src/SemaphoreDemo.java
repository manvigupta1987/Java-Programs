import java.util.concurrent.Semaphore;

class Shared{
	static int count = 0;
}

class MyThread extends Thread{
	Semaphore sem;
    String threadName;
    
    public MyThread(Semaphore sem, String threadName) 
    {
        super(threadName);
        this.sem = sem;
        this.threadName = threadName;
    }
    @Override
    public void run() {
    	
    	if(this.getName().equals("A")){
    		System.out.println("Starting " + threadName);
    		try {
    			 System.out.println(threadName + " is waiting for a permit.");
                 
                 // acquiring the lock
                 sem.acquire();
                 for(int i=0; i < 5; i++)
                 {
                     Shared.count++;
                     System.out.println(threadName + ": " + Shared.count);
          
                     // Now, allowing a context switch -- if possible.
                     // for thread B to execute
                     Thread.sleep(10);
                 }
             } catch (InterruptedException exc) {
                     System.out.println(exc);
                 }
    		 System.out.println(threadName + " releases the permit.");
             sem.release();
    	} else {
    		System.out.println("Starting " + threadName);
            try
            {
                // First, get a permit.
                System.out.println(threadName + " is waiting for a permit.");
             
                // acquiring the lock
                sem.acquire();
             
                System.out.println(threadName + " gets a permit.");
         
                // Now, accessing the shared resource.
                // other waiting threads will wait, until this 
                // thread release the lock
                for(int i=0; i < 5; i++)
                {
                    Shared.count--;
                    System.out.println(threadName + ": " + Shared.count);
         
                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                    System.out.println(exc);
                }
                // Release the permit.
                System.out.println(threadName + " releases the permit.");
                sem.release();
        }
		
    }      
    
}



public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Semaphore sem = new Semaphore(2);
		
		MyThread thread1 = new MyThread(sem, "A");
		MyThread thread2 = new MyThread(sem, "B");
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println("count: " + Shared.count);	
	}
}

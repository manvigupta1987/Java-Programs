// Java program to illustrate Callable and FutureTask
// for random number generation
import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
 
class CallableExample implements Callable{

	@Override
	public Object call() throws Exception {
	 
		Random number = new Random();
		 Integer randomNumber = number.nextInt(5);
		 
		 Thread.sleep(randomNumber * 1000);
		 
		 return randomNumber;
	}
	
}



public class FutureCallableDemo {
	 public static void main(String[] args) throws InterruptedException, ExecutionException
	 {
		 FutureTask[] futureTask= new FutureTask[5];
		
		 for(int i = 0 ; i<5; i++) {
			 CallableExample callableExample = new CallableExample();
			 futureTask[i] = new FutureTask(callableExample);
			 
			 Thread thread = new Thread(futureTask[i]);
			 thread.start();
		 }
		 for (int i = 0; i < 5; i++)
		    {
		      // As it implements Future, we can call get()
		      System.out.println(futureTask[i].get());
		 
		      // This method blocks till the result is obtained
		      // The get method can throw checked exceptions
		      // like when it is interrupted. This is the reason
		      // for adding the throws clause to main
		    }
		 
	 }
}

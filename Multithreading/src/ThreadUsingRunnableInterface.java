class Hi implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++) {
			System.out.println("Hi");	
			try {
				Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
		}		
	}
	
}

class Hello implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++) {
			System.out.println("Hello");
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}		
	}
	
}


public class ThreadUsingRunnableInterface {
	public static void main(String[] args) {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
	}
}

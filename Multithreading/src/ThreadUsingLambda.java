	public class ThreadUsingLambda {
		public static void main(String[] args) {
			
		Thread t1 = new Thread(()-> 
			{
				// TODO Auto-generated method stub
				for(int i =0; i<5; i++) {
					System.out.println("Hi");	
					try {
						Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
						}
				}
			}, "Hi thread");
			Thread t2 = new Thread(()->{
				// TODO Auto-generated method stub
				for(int i =0; i<5; i++) {
					System.out.println("Hello");
					try {
					Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}	
			}, "hello thread");
			
			t1.start();
			t2.start();
			
		}
	}

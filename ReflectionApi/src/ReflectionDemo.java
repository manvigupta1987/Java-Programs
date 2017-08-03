
public class ReflectionDemo {
	public String s;
	
	public ReflectionDemo()  {  s = "GeeksforGeeks"; }
	
	private void show() {
		System.out.println("in Show");		
	}
	
	public void method1()  {
        System.out.println("The string is " + s);
    }
 
    // Creating a public method with int as argument
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }
 
    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}

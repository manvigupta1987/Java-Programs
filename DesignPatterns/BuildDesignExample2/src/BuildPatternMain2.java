import com.phone.*;

public class BuildPatternMain2 {
	public static void main(String[] args) {
		Phone phone = new PhoneBuilder().setOs("Android")
							.setScreenSize(5.4)
							.getPhone();
		
		System.out.println(phone);
	}
}

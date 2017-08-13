
public class ProtectionProxyDemo {
	public static void main(String[] args) {
		
		InternetProxyServer proxyServer = new InternetProxyServer();
		try {
			proxyServer.connectTo("geeksforgeeks.org");
			proxyServer.connectTo("facebook.com");
			proxyServer.connectTo("abc.com");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}

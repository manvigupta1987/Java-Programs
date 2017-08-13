import java.util.ArrayList;
import java.util.List;

public class InternetProxyServer implements Internet {

	private static List<String> bannedSites;
	
	public InternetProxyServer() {
		// TODO Auto-generated constructor stub
		bannedSites = new ArrayList<>();
		bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
	}
	
	@Override
	public void connectTo(String siteName) throws Exception {
		// TODO Auto-generated method stub
		if(bannedSites.contains(siteName.toLowerCase())) {
			throw new Exception("Access Denied");
		}else {
			RealInternet internet = new RealInternet();
			internet.connectTo(siteName);
		}		
	}
}

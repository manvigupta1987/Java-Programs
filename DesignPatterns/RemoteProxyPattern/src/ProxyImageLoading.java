
public class ProxyImageLoading implements ImageLoading{

	RealImageLoading realImage;
	private String fileName;
	
	public ProxyImageLoading(String fileName) {
		// TODO Auto-generated constructor stub
		this.fileName = fileName;
	}
	
	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		if(realImage == null) {
			realImage = new RealImageLoading(fileName);
		}
		realImage.displayImage();
	}
}

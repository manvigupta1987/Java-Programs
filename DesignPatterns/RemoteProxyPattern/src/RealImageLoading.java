
public class RealImageLoading implements ImageLoading{
	
	private String fileName; 
	public RealImageLoading(String fileName) {
		this.fileName = fileName;
		loadImageFromDisk();
	}

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		System.out.println("displaying image " + fileName);
	}
	
	private void loadImageFromDisk() {
		System.out.println("Loading from disk" + fileName);
	}

}

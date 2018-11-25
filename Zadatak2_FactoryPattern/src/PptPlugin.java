
public class PptPlugin extends AbsPlugin {

	private Ppt ppt;
	
	public PptPlugin() {
		
	}
	
	@Override
	public void openDoc() {
		ppt.open();

	}

	@Override
	public void closeDoc() {
		ppt.close();

	}

	@Override
	public void saveDoc() {
		ppt.save();

	}

	@Override
	public AbsDocument fetchDoc(String url) {
		System.out.println("Fetching document from "+url+"...");
		ppt = new Ppt();
		return ppt;
	}

}

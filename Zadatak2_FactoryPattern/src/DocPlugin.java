
public class DocPlugin extends AbsPlugin {

	private Doc document;
	
	public DocPlugin() {
		
	}
	
	@Override
	public void openDoc() {
		
		document.open();
	}

	@Override
	public void closeDoc() {
		document.close();
		
	}

	@Override
	public void saveDoc() {
		document.save();
		
	}

	@Override
	public AbsDocument fetchDoc(String url) {
		System.out.println("Fetching document from "+url+"...");
		document = new Doc();
		return document;
	}


	




	
}

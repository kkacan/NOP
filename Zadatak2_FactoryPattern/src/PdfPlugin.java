
public class PdfPlugin extends AbsPlugin {

	private Pdf pdf;
	
	public PdfPlugin() {
		
	}

	@Override
	public void openDoc() {
		pdf.open();
	}

	@Override
	public void closeDoc() {
		pdf.close();
		
	}

	@Override
	public void saveDoc() {
		pdf.save();
		
	}

	@Override
	public AbsDocument fetchDoc(String url) {
		System.out.println("Fetching document from "+url+"...");
		pdf = new Pdf();
		return pdf;
	}

	
	
}

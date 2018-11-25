
public class WebBrowser implements AbsWebBrowser {
	
	private AbsDocument doc;
	private AbsPlugin plugin;
	
	public WebBrowser() {
		
	}

	public WebBrowser(AbsDocument doc) {
		this.doc=doc;
	}
	
	public void setPlugin(AbsPlugin plugin) {
		this.plugin=plugin;
		
	}

	@Override
	public void openDoc() {
		doc.open();

	}

	@Override
	public void closeDoc() {
		doc.close();

	}

	@Override
	public void saveDoc() {
		doc.save();

	}

	@Override
	public AbsDocument fetchDoc(String url) {

		this.doc = plugin.fetchDoc(url);
		return doc;
	}


	public void setDoc(AbsDocument doc) {
		this.doc = doc;
	}

	

}

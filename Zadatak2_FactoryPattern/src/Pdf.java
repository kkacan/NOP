
public class Pdf extends AbsDocument {

	@Override
	public void open() {
		System.out.println("Opening document ...");
		System.out.println("... *.pdf");

	}

	@Override
	public void close() {
		System.out.println("Closing document ...");
		System.out.println("... *.pdf");

	}

	@Override
	public void save() {
		System.out.println("Saving document ...");
		System.out.println("... *.pdf");

	}

}

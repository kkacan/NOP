import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		String URL;
		WebBrowser wb = new WebBrowser();
			
		System.out.println("************* WEB BROWSER *************");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter url: ");
		
		URL=sc.nextLine();
		
		sc.close();
			
		Random ran = new Random();
		int tip = ran.nextInt(3) + 1;

		switch (tip) {
        	case 1:  
        		wb.setPlugin(new DocPlugin());
                break;
        	case 2:  
        		wb.setPlugin(new PdfPlugin());
                break;
        	case 3:  
        		wb.setPlugin(new PptPlugin());
                break;
		}
		
		wb.fetchDoc(URL);
		Sleep(2);
		wb.openDoc();
		Sleep(2);
		wb.saveDoc();
		Sleep(2);
		wb.closeDoc();

	}
	
	private static void Sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}

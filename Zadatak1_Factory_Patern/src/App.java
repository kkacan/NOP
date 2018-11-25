import java.util.Scanner;

public class App {
	
	private static AbsFactoryTheme factory;
	private static ScrollBarInterface scrollbar;
	private static MenuBarInterface menubar;
	private static WindowInterface window;
	private static StatusBarInterface statusbar;
	private static ToolBarInterface toolbar;

	public static void main(String[] args) {
		String broj;
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Unesite 1 za Light, 2 za Dark ili 3 za Solarized temu");
		
		broj= sc.nextLine();
		
		if (broj.equals("1")) {
			
			factory = new LightVisualTheme();
			
			menubar = factory.createMenuBar();
			window = factory.createWindow();
			scrollbar = factory.createScrollBar();
			statusbar = factory.createStatusBar();
			toolbar = factory.createToolBar();
			
			menubar.render();
			window.render();
			scrollbar.render();
			statusbar.render();
			toolbar.render();
			
			
		} else if (broj.equals("2")) {
			factory = new DarkTheme();
			
			menubar = factory.createMenuBar();
			window = factory.createWindow();
			scrollbar = factory.createScrollBar();
			statusbar = factory.createStatusBar();
			toolbar = factory.createToolBar();
			
			menubar.render();
			window.render();
			scrollbar.render();
			statusbar.render();
			toolbar.render();
			
		}else if (broj.equals("3")) {
			factory = new SolarizedDarkTheme();
			
			menubar = factory.createMenuBar();
			window = factory.createWindow();
			scrollbar = factory.createScrollBar();
			statusbar = factory.createStatusBar();
			toolbar = factory.createToolBar();
			
			menubar.render();
			window.render();
			scrollbar.render();
			statusbar.render();
			toolbar.render();
		}

	}

}

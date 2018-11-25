
public class DarkTheme implements AbsFactoryTheme {

	@Override
	public ScrollBarInterface createScrollBar() {
		ScrollBarDark scrollBar =new ScrollBarDark();
		return scrollBar;
	}

	@Override
	public MenuBarInterface createMenuBar() {
		MenuBarDark menuBar =new MenuBarDark();
		return menuBar;
	}

	@Override
	public ToolBarInterface createToolBar() {
		ToolBarDark toolBar =new ToolBarDark();
		return toolBar;
	}

	@Override
	public StatusBarInterface createStatusBar() {
		StatusBarDark statusBar =new StatusBarDark();
		return statusBar;
	}

	@Override
	public WindowInterface createWindow() {
		WindowDark window =new WindowDark();
		return window;
	}


	

}


public class SolarizedDarkTheme implements AbsFactoryTheme {

	@Override
	public ScrollBarInterface createScrollBar() {
		ScrollBarSolarized scrollBar =new ScrollBarSolarized();
		return scrollBar;
	}

	@Override
	public MenuBarInterface createMenuBar() {
		MenuBarSolarized menuBar =new MenuBarSolarized();
		return menuBar;
	}

	@Override
	public ToolBarInterface createToolBar() {
		ToolBarSolarized toolBar =new ToolBarSolarized();
		return toolBar;
	}

	@Override
	public StatusBarInterface createStatusBar() {
		StatusBarSolarized statusBar =new StatusBarSolarized();
		return statusBar;
	}

	@Override
	public WindowInterface createWindow() {
		WindowSolarized window =new WindowSolarized();
		return window;
	}

	

}

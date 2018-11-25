
public class LightVisualTheme implements AbsFactoryTheme {

	@Override
	public ScrollBarInterface createScrollBar() {
		ScrollBarLight scrollBar =new ScrollBarLight();
		return scrollBar;
	}

	@Override
	public MenuBarInterface createMenuBar() {
		MenuBarLight menuBar =new MenuBarLight();
		return menuBar;
	}

	@Override
	public ToolBarInterface createToolBar() {
		ToolBarLight toolBar =new ToolBarLight();
		return toolBar;
	}

	@Override
	public StatusBarInterface createStatusBar() {
		StatusBarLight statusBar =new StatusBarLight();
		return statusBar;
	}

	@Override
	public WindowInterface createWindow() {
		WindowLight window =new WindowLight();
		return window;
	}

	
	
	

}

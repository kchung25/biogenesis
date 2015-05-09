package gui_tests;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;

public class ClickResume extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public ClickResume() {
		super(main.java.biogenesis.MainWindow.class);
	}

	/**
	 * Main test method.
	 */
	public void testClickResume() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("Resume"));
	}
}
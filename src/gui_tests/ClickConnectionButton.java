package gui_tests;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;

public class ClickConnectionButton extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public ClickConnectionButton() {
		super(main.java.biogenesis.MainWindow.class);
	}

	/**
	 * Main test method.
	 */
	public void testClickConnectionButton() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("Manage connections..."));
	}
}
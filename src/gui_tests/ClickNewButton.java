package gui_tests;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;

public class ClickNewButton extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public ClickNewButton() {
		super(main.java.biogenesis.MainWindow.class);
	}

	/**
	 * Main test method.
	 */
	public void testGUI_Test_1() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
	}

}
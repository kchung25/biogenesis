package gui_tests;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.condition.WindowShowingCondition;
import com.windowtester.runtime.swing.condition.WindowDisposedCondition;

public class ClickSaveButton extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public ClickSaveButton() {
		super(main.java.biogenesis.MainWindow.class);
	}

	/**
	 * Main test method.
	 */
	public void testClickSaveButton() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("Save"));
		ui.wait(new WindowShowingCondition("Save"));
		ui.click(new JButtonLocator("Cancel"));
		ui.wait(new WindowDisposedCondition("Save"));
	}
}
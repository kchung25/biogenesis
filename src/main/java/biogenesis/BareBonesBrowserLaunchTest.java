package main.java.biogenesis;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BareBonesBrowserLaunchTest</code> contains tests for the class <code>{@link BareBonesBrowserLaunch}</code>.
 *
 * @generatedBy CodePro at 5/9/15 3:29 PM
 * @author User
 * @version $Revision: 1.0 $
 */
public class BareBonesBrowserLaunchTest {
	/**
	 * Run the BareBonesBrowserLaunch() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/15 3:29 PM
	 */
	@Test
	public void testBareBonesBrowserLaunch_1()
		throws Exception {
		BareBonesBrowserLaunch result = new BareBonesBrowserLaunch();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void openURL(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:29 PM
	 */
	@Test
	public void testOpenURL_1()
		throws Exception {
		String url = "";

		BareBonesBrowserLaunch.openURL(url);

		// add additional test code here
	}
	
	@Test
	public void testOpenURL_2()
		throws Exception {
		String url = "www.google.com";

		BareBonesBrowserLaunch.openURL(url);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:29 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:29 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/9/15 3:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BareBonesBrowserLaunchTest.class);
	}
}
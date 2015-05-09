package main.java.biogenesis;

import java.util.Locale;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MessagesTest</code> contains tests for the class <code>{@link Messages}</code>.
 *
 * @generatedBy CodePro at 5/9/15 2:35 PM
 * @author Sabin
 * @version $Revision: 1.0 $
 */
public class MessagesTest {
	/**
	 * Run the Messages() constructor test.
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testMessages_1()
		throws Exception {
		Messages result = new Messages();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void changeLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testChangeLocale_1()
		throws Exception {

		Messages.changeLocale();

		// add additional test code here
	}

	/**
	 * Run the String getLanguage() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetLanguage_1()
		throws Exception {

		String result = Messages.getLanguage();

		// add additional test code here
		assertEquals("", result);
	}

	/**
	 * Run the Locale getLocale() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetLocale_1()
		throws Exception {

		Locale result = Messages.getLocale();

		// add additional test code here
		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getLanguage());
		assertEquals("", result.getCountry());
		assertEquals("", result.getDisplayCountry());
		assertEquals("", result.getDisplayLanguage());
		assertEquals("", result.getDisplayName());
		assertEquals("", result.getDisplayScript());
		assertEquals("", result.getDisplayVariant());
		assertEquals("", result.getISO3Country());
		assertEquals("", result.getISO3Language());
		assertEquals("", result.getScript());
		assertEquals("", result.getVariant());
		assertEquals(false, result.hasExtensions());
		assertEquals("und", result.toLanguageTag());
	}

	/**
	 * Run the int getLocaleIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetLocaleIndex_1()
		throws Exception {

		int result = Messages.getLocaleIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLocaleIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetLocaleIndex_2()
		throws Exception {

		int result = Messages.getLocaleIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getLocaleIndex() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetLocaleIndex_3()
		throws Exception {

		int result = Messages.getLocaleIndex();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the Integer getMnemonic(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetMnemonic_1()
		throws Exception {
		String key = "RED";

		Integer result = Messages.getMnemonic(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.codePointAt(Unknown Source)
		//       at main.java.biogenesis.Messages.getMnemonic(Messages.java:65)
		assertNotNull(result);
	}

	/**
	 * Run the String getString(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetString_1()
		throws Exception {
		String key = "";

		String result = Messages.getString(key);

		// add additional test code here
		assertEquals("!!", result);
	}

	/**
	 * Run the String getString(String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetString_2()
		throws Exception {
		String key = "";
		String param1 = "";

		String result = Messages.getString(key, param1);

		// add additional test code here
		assertEquals("!!", result);
	}

	/**
	 * Run the String getString(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetString_3()
		throws Exception {
		String key = "";
		String[] params = new String[] {""};

		String result = Messages.getString(key, params);

		// add additional test code here
		assertEquals("!!", result);
	}

	/**
	 * Run the String getString(String,String[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetString_4()
		throws Exception {
		String key = "";
		String[] params = new String[] {};

		String result = Messages.getString(key, params);

		// add additional test code here
		assertEquals("!!", result);
	}

	/**
	 * Run the String getString(String,String,String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetString_5()
		throws Exception {
		String key = "";
		String param1 = "";
		String param2 = "";

		String result = Messages.getString(key, param1, param2);

		// add additional test code here
		assertEquals("!!", result);
	}

	/**
	 * Run the String[] getSupportedLocalesNames() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testGetSupportedLocalesNames_1()
		throws Exception {

		String[] result = Messages.getSupportedLocalesNames();

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.length);
		System.out.println(result[0] + " " + result[1] + " " + result[2]);
		assertEquals("Catalan", result[0]);
		assertEquals("English", result[1]);
		assertEquals("Spanish", result[2]);
	}

	/**
	 * Run the void setLocale(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testSetLocale_1()
		throws Exception {
		int index = 1;

		Messages.setLocale(index);

		// add additional test code here
	}

	/**
	 * Run the void setLocale(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	@Test
	public void testSetLocale_2()
		throws Exception {
		String language = "";

		Messages.setLocale(language);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 2:35 PM
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
	 * @generatedBy CodePro at 5/9/15 2:35 PM
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
	 * @generatedBy CodePro at 5/9/15 2:35 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MessagesTest.class);
	}
}
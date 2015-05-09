package main.java.biogenesis;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>BioFileFilterTest</code> contains tests for the class <code>{@link BioFileFilter}</code>.
 *
 * @generatedBy CodePro at 5/9/15 3:36 PM
 * @author User
 * @version $Revision: 1.0 $
 */
public class BioFileFilterTest {
	/**
	 * Run the BioFileFilter(Object) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	BioFileFilter bgw;
	BioFileFilter bgg;
	BioFileFilter png;
	BioFileFilter empty;
	World w;
	GeneticCode g;
	@Test
	public void testBioFileFilter()
		throws Exception {
		Object obj1 = w;
		Object obj2 = g;
		BioFileFilter result1 = new BioFileFilter(obj1);
		BioFileFilter result2 = new BioFileFilter(obj2);
		// add additional test code here
		assertNotNull(result1);
		assertNotNull(result2);
		assertEquals("Biogenesis world files (*.bgw)", result1.getDescription());
		assertEquals("bgw", result1.getValidExtension());
		assertEquals("Biogenesis genetic code files (*.bgg)", result2.getDescription());
		assertEquals("bgg", result2.getValidExtension());
	}

	/**
	 * Run the BioFileFilter(String) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testBioFileFilter_5()
		throws Exception {
		String ext = "";

		BioFileFilter result = new BioFileFilter(ext);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.getDescription());
		assertEquals("", result.getValidExtension());
	}

	/**
	 * Run the boolean accept(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testAccept_1()
		throws Exception {
		BioFileFilter fixture = new BioFileFilter("");
		File f = new File("");

		boolean result = fixture.accept(f);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean accept(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testAccept_2()
		throws Exception {
		BioFileFilter fixture = new BioFileFilter("");
		File f = new File("");

		boolean result = fixture.accept(f);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean accept(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testAccept_3()
		throws Exception {
		BioFileFilter fixture = new BioFileFilter("");
		File f = new File("");

		boolean result = fixture.accept(f);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean accept(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testAccept_4()
		throws Exception {
		BioFileFilter fixture = new BioFileFilter("");
		File f = new File("");

		boolean result = fixture.accept(f);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the String getDescription() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testGetDescription()
		throws Exception {
		
		String result1 = bgw.getDescription();
		String result2 = bgg.getDescription();
		String result3 = png.getDescription();
		String result4 = empty.getDescription();
		// add additional test code here
		assertEquals("Biogenesis world files (*.bgw)", result1);
		assertEquals("Biogenesis genetic code files (*.bgg)", result2);
		assertEquals("PNG image files (*.png)", result3);
		assertNull(result4);
	}

	
	/**
	 * Run the String getValidExtension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Test
	public void testGetValidExtension_1()
		throws Exception {
		String result1 = bgw.getValidExtension();
		String result2 = bgg.getValidExtension();
		String result3 = png.getValidExtension();
		// add additional test code here
		assertEquals("bgw", result1);
		assertEquals("bgg", result2);
		assertEquals("png", result3);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
		bgw = new BioFileFilter("bgw");
		bgg = new BioFileFilter("bgg");
		png = new BioFileFilter("png");
		empty = new BioFileFilter("");
		w = new World(null);
		g = new GeneticCode();
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
		bgw = null;
		bgg = null;
		png = null;
		w = null;
		g = null;
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/9/15 3:36 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BioFileFilterTest.class);
	}
}
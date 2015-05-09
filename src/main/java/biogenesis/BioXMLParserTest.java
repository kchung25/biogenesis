package main.java.biogenesis;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.metadata.IIOMetadataNode;
import javax.xml.parsers.DocumentBuilder;
import org.junit.*;
import static org.junit.Assert.*;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;

/**
 * The class <code>BioXMLParserTest</code> contains tests for the class <code>{@link BioXMLParser}</code>.
 *
 * @generatedBy CodePro at 5/9/15 3:21 PM
 * @author User
 * @version $Revision: 1.0 $
 */
public class BioXMLParserTest {
	/**
	 * Run the BioXMLParser() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testBioXMLParser_1()
		throws Exception {

		BioXMLParser result = new BioXMLParser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the BioXMLParser() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testBioXMLParser_2()
		throws Exception {

		BioXMLParser result = new BioXMLParser();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void error(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testError_1()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		SAXParseException arg0 = new SAXParseException("", new Locator2Impl());

		fixture.error(arg0);

		// add additional test code here
	}

	/**
	 * Run the void fatalError(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testFatalError_1()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		SAXParseException arg0 = new SAXParseException("", new Locator2Impl());

		fixture.fatalError(arg0);

		// add additional test code here
	}

	/**
	 * Run the Gene parseGene(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGene_1()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		Element gene = new IIOMetadataNode();

		Gene result = fixture.parseGene(gene);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGene(BioXMLParser.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the Gene parseGene(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGene_2()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		Element gene = new IIOMetadataNode();

		Gene result = fixture.parseGene(gene);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGene(BioXMLParser.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the Gene parseGene(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGene_3()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		Element gene = new IIOMetadataNode();

		Gene result = fixture.parseGene(gene);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGene(BioXMLParser.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the Gene parseGene(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGene_4()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		Element gene = new IIOMetadataNode();

		Gene result = fixture.parseGene(gene);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGene(BioXMLParser.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the Gene parseGene(Element) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGene_5()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		Element gene = new IIOMetadataNode();

		Gene result = fixture.parseGene(gene);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGene(BioXMLParser.java:133)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_1()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_2()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_3()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_4()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_5()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_6()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_7()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_8()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_9()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_10()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("a");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the GeneticCode parseGeneticCode(File) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testParseGeneticCode_11()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		File f = new File("");

		GeneticCode result = fixture.parseGeneticCode(f);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at main.java.biogenesis.BioXMLParser.parseGeneticCode(BioXMLParser.java:85)
		assertNotNull(result);
	}

	/**
	 * Run the void warning(SAXParseException) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test(expected = org.xml.sax.SAXException.class)
	public void testWarning_1()
		throws Exception {
		BioXMLParser fixture = new BioXMLParser();
		fixture.builder = null;
		fixture.doc = null;
		SAXParseException arg0 = new SAXParseException("", new Locator2Impl());

		fixture.warning(arg0);

		// add additional test code here
	}

	/**
	 * Run the void writeGene(PrintStream,Gene) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGene_1()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		Gene gene = new Gene(1.0, 1.0, new Color(1));

		BioXMLParser.writeGene(ps, gene);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_1()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 1, false);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_2()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 0, false);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_3()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 1, true);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_4()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 0, true);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_5()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 1, false);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_6()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 0, false);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_7()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 1, true);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Run the void writeGeneticCode(PrintStream,GeneticCode) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	@Test
	public void testWriteGeneticCode_8()
		throws Exception {
		PrintStream ps = new PrintStream(new ByteArrayOutputStream());
		GeneticCode geneticCode = new GeneticCode(new ArrayList<Gene>(), 1, 0, true);

		BioXMLParser.writeGeneticCode(ps, geneticCode);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:21 PM
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
	 * @generatedBy CodePro at 5/9/15 3:21 PM
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
	 * @generatedBy CodePro at 5/9/15 3:21 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(BioXMLParserTest.class);
	}
}
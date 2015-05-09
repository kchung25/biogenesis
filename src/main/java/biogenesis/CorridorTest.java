package main.java.biogenesis;

import java.net.InetAddress;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CorridorTest</code> contains tests for the class <code>{@link Corridor}</code>.
 *
 * @generatedBy CodePro at 5/9/15 3:16 PM
 * @author User
 * @version $Revision: 1.0 $
 */
public class CorridorTest {
	/**
	 * Run the Organism getTravellingOrganism() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:16 PM
	 */
	@Test
	public void testGetTravellingOrganism_1()
		throws Exception {
		InCorridor fixture = new InCorridor(new World(new VisibleWorld(new MainWindow())));
		fixture.x = 1;
		fixture.y = 1;
		fixture.width = 1;
		fixture.connection = new Connection(new MainWindow(), InetAddress.getLocalHost(), 1);
		fixture.travellingOrganism = new Organism(new World(new VisibleWorld(new MainWindow())));
		fixture.height = 1;
		fixture.world = new World(new VisibleWorld(new MainWindow()));

		Organism result = fixture.getTravellingOrganism();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:76)
		//       at java.io.File.canWrite(Unknown Source)
		//       at sun.awt.shell.ShellFolder.canWrite(Unknown Source)
		//       at sun.swing.FilePane.canWrite(Unknown Source)
		//       at sun.swing.FilePane.doDirectoryChanged(Unknown Source)
		//       at sun.swing.FilePane.propertyChange(Unknown Source)
		//       at java.beans.PropertyChangeSupport.fire(Unknown Source)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(Unknown Source)
		//       at java.beans.PropertyChangeSupport.firePropertyChange(Unknown Source)
		//       at java.awt.Component.firePropertyChange(Unknown Source)
		//       at javax.swing.JFileChooser.setCurrentDirectory(Unknown Source)
		//       at javax.swing.JFileChooser.<init>(Unknown Source)
		//       at javax.swing.JFileChooser.<init>(Unknown Source)
		//       at main.java.biogenesis.MainWindow.<init>(MainWindow.java:41)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:16 PM
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
	 * @generatedBy CodePro at 5/9/15 3:16 PM
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
	 * @generatedBy CodePro at 5/9/15 3:16 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CorridorTest.class);
	}
}
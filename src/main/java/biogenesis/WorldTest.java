package main.java.biogenesis;

import java.awt.Graphics;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DebugGraphics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>WorldTest</code> contains tests for the class <code>{@link World}</code>.
 *
 * @generatedBy CodePro at 5/9/15 3:19 PM
 * @author Sabin
 * @version $Revision: 1.0 $
 */
public class WorldTest {
	/**
	 * Run the World(VisibleWorld) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testWorld_1()
		throws Exception {
		MainWindow window = new MainWindow();
		VisibleWorld visibleWorld = new VisibleWorld(window);
		World result = new World(visibleWorld);
		assertNotNull(result);
		window.dispose();
	}

	/**
	 * Run the void addCO2(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testAddCO2_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;
		double q = 1.0;

		fixture.addCO2(q);
		window.dispose();
	}

	/**
	 * Run the void addCorridors(InCorridor,OutCorridor) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testAddCorridors_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;
		MainWindow window_2 = new MainWindow();
		MainWindow window_3 = new MainWindow();
		MainWindow window_4 = new MainWindow();
		InCorridor in = new InCorridor(new World(new VisibleWorld(window_2)));
		OutCorridor out = new OutCorridor(new World(new VisibleWorld(window_3)), new Connection(window_4, InetAddress.getLocalHost(), 1));
		
		fixture.addCorridors(in, out);
		window.dispose();
		window_2.dispose();
		window_3.dispose();
		window_4.dispose();
	}

	/**
	 * Run the void addO2(double) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testAddO2_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;
		double q = 1.0;

		fixture.addO2(q);
		window.dispose();
	}

	/**
	 * Run the void addOrganism(Organism,Organism) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testAddOrganism_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;
		MainWindow window_1 = new MainWindow();
		MainWindow window_2 = new MainWindow();
		Organism child = new Organism(new World(new VisibleWorld(window_1)));
		Organism parent = new Organism(new World(new VisibleWorld(window_2)));

		fixture.addOrganism(child, parent);
		window.dispose();
		window_1.dispose();
		window_2.dispose();
	}


	/**
	 * Run the Organism checkHit(Organism) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testCheckHit_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;
		MainWindow window_1 = new MainWindow();
		Organism org1 = new Organism(new World(new VisibleWorld(window_1)));

		Organism result = fixture.checkHit(org1);

		assertNull(result);
		window.dispose();
		window_1.dispose();
	}

	/**
	 * Run the void time() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	@Test
	public void testTime_1()
		throws Exception {
		MainWindow window = new MainWindow();
		World fixture = new World(new VisibleWorld(window));
		fixture._population = 1;
		fixture._width = 1;
		fixture._O2 = 1.0;
		fixture.inCorridors = new ArrayList<InCorridor>();
		fixture._organisms = new ArrayList<Organism>();
		fixture._height = 1;
		fixture.worldStatistics = new WorldStatistics();
		fixture.outCorridors = new ArrayList<OutCorridor>();
		fixture._CO2 = 1.0;
		fixture.NEXT_ID = 1;

		fixture.time();
		window.dispose();
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 3:19 PM
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
	 * @generatedBy CodePro at 5/9/15 3:19 PM
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
	 * @generatedBy CodePro at 5/9/15 3:19 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(WorldTest.class);
	}
}
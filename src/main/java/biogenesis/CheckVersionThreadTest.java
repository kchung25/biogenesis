package main.java.biogenesis;

import javax.swing.JFrame;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CheckVersionThreadTest</code> contains tests for the class <code>{@link CheckVersionThread}</code>.
 *
 * @generatedBy CodePro at 5/9/15 4:28 PM
 * @author User
 * @version $Revision: 1.0 $
 */
public class CheckVersionThreadTest {
	/**
	 * Run the CheckVersionThread(JFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 4:28 PM
	 */
	@Test
	public void testCheckVersionThread_1()
		throws Exception {
		JFrame frame = new JFrame();

		CheckVersionThread result = new CheckVersionThread(frame);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Thread[Thread-2420,1,main]", result.toString());
		assertEquals(false, result.isInterrupted());
		assertEquals("Thread-2420", result.getName());
		assertEquals(0, result.countStackFrames());
		assertEquals(2934L, result.getId());
		assertEquals(1, result.getPriority());
		assertEquals(false, result.isAlive());
		assertEquals(true, result.isDaemon());
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 4:28 PM
	 */
	@Test
	public void testRun_1()
		throws Exception {
		CheckVersionThread fixture = new CheckVersionThread(new JFrame());

		fixture.run();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.SecurityException: Cannot write to files while generating test cases
		//       at com.instantiations.assist.eclipse.junit.CodeProJUnitSecurityManager.checkWrite(CodeProJUnitSecurityManager.java:70)
		//       at java.io.FileOutputStream.<init>(Unknown Source)
		//       at java.net.SocketOutputStream.<init>(Unknown Source)
		//       at java.net.AbstractPlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.PlainSocketImpl.getOutputStream(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.net.Socket$3.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.net.Socket.getOutputStream(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.openServer(Unknown Source)
		//       at sun.net.www.http.HttpClient.<init>(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.http.HttpClient.New(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$6.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivileged(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.plainConnect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.connect(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream0(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.access$200(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$9.run(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection$9.run(Unknown Source)
		//       at java.security.AccessController.doPrivileged(Native Method)
		//       at java.security.AccessController.doPrivileged(Unknown Source)
		//       at sun.net.www.protocol.http.HttpURLConnection.getInputStream(Unknown Source)
		//       at java.net.URL.openStream(Unknown Source)
		//       at main.java.biogenesis.CheckVersionThread.run(CheckVersionThread.java:66)
	}

	/**
	 * Run the String translateVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 4:28 PM
	 */
	@Test
	public void testTranslateVersion_1()
		throws Exception {
		String str = "";

		String result = CheckVersionThread.translateVersion(str);

		// add additional test code here
		assertEquals("0.0", result);
	}

	/**
	 * Run the String translateVersion(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/9/15 4:28 PM
	 */
	@Test
	public void testTranslateVersion_2()
		throws Exception {
		String str = "a";

		String result = CheckVersionThread.translateVersion(str);

		// add additional test code here
		assertEquals("a", result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/9/15 4:28 PM
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
	 * @generatedBy CodePro at 5/9/15 4:28 PM
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
	 * @generatedBy CodePro at 5/9/15 4:28 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CheckVersionThreadTest.class);
	}
}
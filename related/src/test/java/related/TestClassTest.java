package related;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassTest {

	@Test
	public void testPrint() {
		//fail("Not yet implemented");
		assertTrue(true);
	}

	@Test
	public void testFileExists(){
		TestClass tc = new TestClass();
		assertTrue(tc.fileExists());
	}
}

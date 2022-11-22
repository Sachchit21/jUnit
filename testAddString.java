import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class T1 {

	@Test
	void test() {
		//fail("Not yet implemented");
		ABC a=new ABC();
		String r=a.testAddStrings("Hlo","World");
		assertEquals("Hloworld",r);
	}

}

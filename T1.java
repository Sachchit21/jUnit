import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class T1 {

	@Test
	void test() {
		//fail("Not yet implemented");
		ABC a=new ABC();
		int r=a.testAddNumbers(100, 200);
		assertEquals(300,r);
	}

}

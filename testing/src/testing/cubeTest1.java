package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class cubeTest1 {

	@Test
	public void test() {
		example test=new example();
		int output=test.cube(5);
		assertEquals(125,output);
	}

}

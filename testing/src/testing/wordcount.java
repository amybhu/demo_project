package testing;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class wordcount {

	@Test
	public void test() {
		example test=new example();
		int output=test.count("Amartya");
		assertEquals(3,output);
	}

}

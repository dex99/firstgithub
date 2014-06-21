package proba_java;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void test() {
		//fail("Not yet implemented");

		wallet w = new wallet(5);
		
		   
		 // check if multiply(10,5) returns 50
		assertEquals("set value to 5", 5, w.getValue());
		w.setValue(6);
		assertEquals("set value to 5", 6, w.getValue());		
	}

}

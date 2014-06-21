package proba_java;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.Assert.*;

import org.junit.Test;



@RunWith(Suite.class)
@SuiteClasses({ test.class,test2.class })
public class testSuite {

	

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

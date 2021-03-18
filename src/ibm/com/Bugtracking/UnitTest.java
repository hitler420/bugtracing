package ibm.com.Bugtracking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
	 Developer developer=new Developer(0);
	 Bug result=developer.getMyBug();
	 Assert.assertEquals(null, result);
	}

}

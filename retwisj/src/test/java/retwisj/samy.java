package retwisj;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.data.redis.samples.retwisj.User;

public class samy {

	@Test
	public void test() {
		String un= "samy";
		String pw= "samy";
		User samy = new User(un,pw);
		if(samy.getName() !="samya")
		{
			fail("Error name");
		}
	}
	
}

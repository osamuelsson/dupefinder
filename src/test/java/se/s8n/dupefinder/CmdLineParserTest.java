package se.s8n.dupefinder;


import org.junit.Before;
import org.junit.Test;

import se.s8n.dupefinder.CmdLineParser;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class CmdLineParserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public  void testGetDbRoot() throws Exception {
		CmdLineParser testee = new CmdLineParser(new String[] { "-a", "hej" });
		String actual = testee.getDbRoot();
		assertThat(actual, is("D:\\Documents"));
	}

	@Test
	public void testGetAction() throws Exception {
		;
	}
	
}

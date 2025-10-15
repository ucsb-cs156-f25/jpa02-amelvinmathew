package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Melvin M.", Developer.getName());
    }

	@Test
	public void getGithubId_returns_correct_githubId(){
		assertEquals("amelvinmathew", Developer.getGithubId());
	}

	@Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-05", t.getName());
    }

	    @Test
    public void getTeam_returns_team_with_correct_members() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("BRIAN PATRICK"),"Team should contain Brian S.");
        assertTrue(t.getMembers().contains("HECHENJIN"),"Team should contain Hechenjin Y. ");
        assertTrue(t.getMembers().contains("JASMINE"),"Team should contain Jasmine T.");
        assertTrue(t.getMembers().contains("KENNEDY"),"Team should contain Kennedy N.");
        assertTrue(t.getMembers().contains("MELVIN ANTHONY"),"Team should contain Melvin M.");
        assertTrue(t.getMembers().contains("MON RAPHAEL"),"Team should contain Mon F.");
    }


    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}

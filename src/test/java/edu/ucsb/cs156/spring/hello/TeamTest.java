package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
	
	@Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
	
	@Test
	public void equals_testing(){
		Object obj = new Object();
		Team t2 = new Team("test-team");
		t2.addMember("tester");
		Team t3 = new Team("team");
		t3.addMember("tester");
		assert(team.equals(team));
		assert(!team.equals(obj));
		assert(!team.equals(t2));
		assert(!t3.equals(t2));
	}

	@Test
public void hashcode_testing() {
    Team t1 = new Team();
    t1.setName("foo");
    t1.addMember("bar");

    Team t2 = new Team();
    t2.setName("foo");
    t2.addMember("bar");

    assertEquals(t1.hashCode(), t2.hashCode());

    Team t3 = new Team();
    t3.setName("baz");
    t3.addMember("bar");
    assert(t1.hashCode() != t3.hashCode());

    Team t4 = new Team();
    t4.setName("foo");
    t4.addMember("qux");
    assert(t1.hashCode() != t4.hashCode());

	assert(t1.hashCode() != (t1.name.hashCode() & t1.members.hashCode()));

}
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}

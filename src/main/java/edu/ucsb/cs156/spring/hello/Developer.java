package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Melvin M.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "amelvinmathew";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-05");
        team.addMember("Brian");
        team.addMember("Hechenjin");
        team.addMember("Jasmine");
        team.addMember("Kennedy");
        team.addMember("Melvin");
        team.addMember("Mon");
        return team;
    }
}

package sachika;

import java.io.Serializable;

public abstract class Driver implements Serializable {
    private String name;//veriable
    private String location;
    private String team;
//    private Formula1Driver statistics;

    public Driver() {

    }

    public Driver(String name, String location, String team) {
        this.name = name;
        this.location = location;
        this.team = team;
    }


    // initalizing Getters and Setters to retrieving and updating the value of a variable outside the  class


    // using Getter to names
    public String getName() {
        return this.name;
    }
    //using setters to names
    public void setName(String name) {
        this.name = name;
    }


    // using Getter to location
    public String getlocation() {
        return this.location;
    }
    // using Getter to location
    public void setlocation(String location) {
        this.location = location;
    }


    // using Getter to team
    public String getTeam() {
        return this.team;
    }
    //using setter to teams
    public void setteam(String team) {
        this.team = team;
    }

}


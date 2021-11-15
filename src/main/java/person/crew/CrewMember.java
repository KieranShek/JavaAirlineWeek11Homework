package person.crew;

import person.Person;

public abstract class CrewMember extends Person {

    private String name;
    private CrewType crewType;
    private String announcement;

//    constructor

    public CrewMember(String name, CrewType crewType) {
        super(name);
        this.crewType = crewType;
    }

    public String makeAnnouncement(String newAnnouncement) {
        return announcement = newAnnouncement;
    }
}
package person.crew;


public class FlightDeck extends CrewMember {

    private String licenseNumber;

//    constructor
    public FlightDeck(String name, CrewType crewType, String licenseNumber){
        super(name, crewType);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String takeOff(){
        return "Engines are burning, wheel are turning";
    }

    public String land() {
        return "Flaps are down fasten your seat belts please";
    }
}
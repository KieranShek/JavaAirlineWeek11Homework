package person.crew;

public enum CrewType {
    CAPTAIN("Captain"),
    FIRSTOFFICER("First Officer"),
    PURSER("Purser"),
    FLIGHTATTENDANT("Flight Attendant");

//    final because hard coded in
    private final String rank;

    CrewType(String rank){
        this.rank = rank;
    }

    public String getRank() {
        return this.rank;
    }
}
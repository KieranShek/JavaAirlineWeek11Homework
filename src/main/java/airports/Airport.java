package airports;

public enum Airport {
    ABZ("Aberdeen"),
    EDI("Edinburgh"),
    GLA("Glasgow"),
    PIK("Glagow Prestwick"),
    INV("Inverness"),
    BHX("Birmingham International"),
    BOH("Bournemouth International"),
    BRS("Bristol"),
    CWL("Cardiff"),
    DSA("Doncaster"),
    MME("Middlesbrough"),
    EMA("East Midlands"),
    EXT("Exeter"),
    LBA("Leeds Bradford International"),
    LPL("Liverpool"),
    LCY("London City"),
    LGW("London Gatwick"),
    LHR("London Heathrow"),
    LTN("London Luton"),
    SEN("Southend"),
    STN("Stansted"),
    MAN("Manchester"),
    NCL("Newcastle"),
    NQY("Newquay"),
    NWI("Norwich"),
    SOU("Southampton");

    private final String airportName;

    Airport(String airportName){
        this.airportName = airportName;
    }

    public String getAirportName(){
        return this.airportName;
    }
}
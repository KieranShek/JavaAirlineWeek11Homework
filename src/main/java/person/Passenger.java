package person;

import person.Person;

public class Passenger extends Person {

    private int luggage;

    public Passenger(String name, int luggage){
        super(name);
        this.luggage = luggage;
    }

    public int getTotalLuggage(){
        return this.luggage;
    }
}

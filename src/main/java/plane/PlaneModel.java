package plane;

public enum PlaneModel {
    B737("737", 100),
    B747("747", 101),
    B767("767", 102),
    B777("777", 103),
    B787("787", 104),
    A300("A300", 105),
    A310("A310", 106),
    A220("A220", 107),
    A318("A318", 108),
    A319("A319", 109),
    A320("A320", 110),
    A321("A321", 111);

    private final String model;
    private final int seats;

//constructor
    PlaneModel(String model, int seats) {
        this.model = model;
        this.seats = seats;
    }

    public String getModel() {
        return this.model;
    }

    public int getNumberOfSeats() {
        return this.seats;
    }
}
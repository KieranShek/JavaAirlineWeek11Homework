package plane;

public class Plane {

    private String planeType;
    private PlaneModel planeModel;

    public Plane(PlaneModel planeModel){
        this.planeModel = planeModel;
    }

    public String getPlaneType(){
        return this.planeType;
    }

}

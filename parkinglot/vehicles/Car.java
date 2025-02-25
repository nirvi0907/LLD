package LLD.parkinglot.vehicles;

public class Car implements IVehicle{
    private int num;
    private String color;
    // private int spotNum;

    public Car(int num){
        this.num = num;
    }
    public String get_plate_num(){
        return num;
    }
    // public String get_ticket_num();
    // public int get_spot_num();
    // public int get_level_num();
    // public String get_color();
}

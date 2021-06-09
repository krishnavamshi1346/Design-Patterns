import java.util.Hashtable;

public class VehicleCreation {

    private static Hashtable<String, Vehicle> VehicleTable  = new Hashtable<String, Vehicle>();

    public static Vehicle getVehicle(String vehicleId) {
        Vehicle cachedVehicle = VehicleTable.get(vehicleId);
        return (Vehicle) cachedVehicle.clone();
    }
    public static void loadVehicle(){
        Bicycle bc = new Bicycle();
        bc.setId("1");
        VehicleTable.put(bc.getId(),bc);

        Bike bi = new Bike();
        bi.setId("2");
        VehicleTable.put(bi.getId(),bi);

        Car c = new Car();
        c.setId("3");
        VehicleTable.put(c.getId(), c);
    }


}

public class PrototypePatternDemo {
    public static void main(String[] args) {
        VehicleCreation.loadVehicle();

        Vehicle clonedVehicle = (Vehicle) VehicleCreation.getVehicle("1");
        System.out.println("Vehicle: " + clonedVehicle.getType());

        Vehicle clonedVehicle2 = (Vehicle) VehicleCreation.getVehicle("2");
        System.out.println("Vehicle: " + clonedVehicle2.getType());

        Vehicle clonedVehicle3 = (Vehicle) VehicleCreation.getVehicle("3");
        System.out.println("Vehicle: " + clonedVehicle3.getType());

        System.out.println("\n\n");
       // System.out.println( clonedVehicle3);
        clonedVehicle3.drive();

        Vehicle clonedVehicle4= (Vehicle) VehicleCreation.getVehicle("1");
        System.out.println("\n\nVehicle: " + clonedVehicle4.getType());



    }
}

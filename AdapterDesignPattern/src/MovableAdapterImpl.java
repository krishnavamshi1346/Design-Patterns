public class MovableAdapterImpl  implements  MovableAdapter{

    private Movable car;
    public MovableAdapterImpl(Movable car)
    {
        this.car=car;
    }

    public double getSpeed()
    {
      return convertMphToKmph( car.getSpeed());
    }

    private double convertMphToKmph(double speed) {
        return speed*1.6;
    }
}

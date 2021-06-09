public class Main {
    public static  void  main(String args[])
    {
        Movable audi=new Audi();
        MovableAdapter audiAdapter=new MovableAdapterImpl(audi);
        System.out.println("Speed in mph    "+audi.getSpeed()+" mph");
         System.out.println("Speed in kmph   "+audiAdapter.getSpeed()+" kmph");




        Movable bmw=new BMW();
        MovableAdapter bmwAdapter=new MovableAdapterImpl(bmw);
        System.out.println("\n\nSpeed in mph    "+bmw.getSpeed()+" mph");
        System.out.println("Speed in kmph   "+bmwAdapter.getSpeed()+" kmph");
    }
}

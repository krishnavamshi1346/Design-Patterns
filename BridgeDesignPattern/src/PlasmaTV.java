public class PlasmaTV extends Television{
    public PlasmaTV(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1,workShop2);
    }
    public void manufacture()
    {
        System.out.print("Plasma TeleVision ");
        workShop1.work();
        workShop2.work();
    }
}



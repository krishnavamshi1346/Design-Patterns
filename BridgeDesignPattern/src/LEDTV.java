public class LEDTV extends Television{
    public LEDTV(Workshop workShop1, Workshop workShop2)

    {
        super(workShop1, workShop2);
    }

    public void manufacture()
    {
        System.out.print("LED Television ");
        workShop1.work();
        workShop2.work();
    }

}

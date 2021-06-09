public class CathodeRayTV extends Television{
    public CathodeRayTV(Workshop workShop1, Workshop workShop2)
    {
        super(workShop1, workShop2);
    }
    public void manufacture()
    {
        System.out.print("CathodeRay Television ");
        workShop1.work();
        workShop2.work();
    }

}

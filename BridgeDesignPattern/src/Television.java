public abstract class Television {

    protected Workshop workShop1;
    protected Workshop workShop2;

    protected Television(Workshop workShop1, Workshop workShop2)
    {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}




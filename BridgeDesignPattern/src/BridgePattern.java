public class BridgePattern {
    public static void main(String[] args) {
        Television tv1=new PlasmaTV(new Produce(),new Assemble());
        tv1.manufacture();

        System.out.println("\n");

        Television tv2=new  CathodeRayTV(new Produce(),new Assemble());
        tv2.manufacture();

        System.out.println("\n");

        Television tv3=new LEDTV(new Produce(),new Assemble());
        tv3.manufacture();

    }
}

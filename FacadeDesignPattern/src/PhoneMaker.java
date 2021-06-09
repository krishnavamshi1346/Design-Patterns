public class PhoneMaker {
    private Phone iphone;
    private Phone jiophone;
    private Phone oneplus;
 public PhoneMaker()
 {
     iphone=new Iphone();
     jiophone=new JioPhone();
     oneplus=new OnePlus();

 }
 public void manufactureIphone(){
     iphone.manufacture();
 }
    public void manufactureJiophone(){
        jiophone.manufacture();
    }
    public void manufactureOneplus(){
        oneplus.manufacture();
    }
}

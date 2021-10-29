public class Laptop {
    private int ram;
    private int hdd;
    private String processor;
    private double screensize;
    public  void initialize(int r,int l,String p,double s){
        ram=r;
        hdd=l;
        processor=p;
        screensize =s;
    }
    public void display(){
        System.out.println("Ram:"+ram);
        System.out.println("HDD:"+hdd);
        System.out.println("Processor:"+processor);
        System.out.println("Screensize:"+ screensize);
    }

}

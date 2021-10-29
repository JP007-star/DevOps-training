public class CarDemo {
    private Tyre tyre;
    private MusicSystem musicSystem;
    public static void main(String[] args) {
        Tyre mrf=new Tyre("mrf",15);
        Tyre applo=new Tyre("applo",15);
        MusicSystem jbl=new MusicSystem("jbl",5,true,4);
        MusicSystem dobly=new MusicSystem("dobly",5,true,4);
        Car nexon=new Car("Nexon","petrol",200,300,5,mrf,jbl);
        Car audi=new Car("Audi","diesel",300,400,6,applo,jbl);
        Car rollsroys=new Car("Rolls Roys","diesel",300,400,6,mrf,jbl);
        nexon.accelerate();
        nexon.applyBrake();
        nexon.changeGear(5);
        nexon.steering();
        nexon.setMusicSystem(dobly);
        nexon.displayFeatures();
        audi.displayFeatures();
        rollsroys.displayFeatures();
        rollsroys.changeGear(7);
        rollsroys.getNoOfGears();


    }
}

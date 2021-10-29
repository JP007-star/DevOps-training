public class Car {
    private String name;
    private String fuelType;
    private int engineCapacity;
    private float power;
    private int noOfGears;
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    private MusicSystem musicSystem;

    public Car(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre,MusicSystem musicSystem) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.power = power;
        this.noOfGears = noOfGears;
        this.tyre = tyre;
        this.musicSystem=musicSystem;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }
    public void accelerate(){
        System.out.println(name+"Car is accelerating...");
    }
    public void applyBrake(){
        System.out.println(name+"Car is applying brake...");
    }
    public void changeGear(int Gear){
        if(Gear<0 || noOfGears<Gear)
            System.out.println("Wrong Gear is applied");
        else
        System.out.println("Car is changed to gear:"+Gear);
    }
    public void steering(){
        System.out.println(name+"Car is changing direction..");
    }

    public void displayFeatures(){
        System.out.println("Features of "+name+" Car:");
        System.out.println("--------------------------");
        System.out.println("FuelType:"+fuelType);
        System.out.println("Engine Capacity:"+engineCapacity+"CC");
        System.out.println("Power:"+power+"BHP");
        System.out.println("No of Gears:"+noOfGears);
        System.out.println("TyreUsed:"+tyre.getName());
        System.out.println("TyreSize:"+tyre.getSize());
        System.out.println("Music System:"+ getMusicSystem().getMsName());
    }
}

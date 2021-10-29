public class BoxDemo {
    public static void main(String[] args) {
        Box b1=new Box();
        b1.initialize(1,4,5);
        b1.display();
        b1.setLength(b1.getLength()*(110/100));
        b1.setWidth(b1.getWidth()*(120/100));
        b1.setHeight(b1.getHeight()*(108/100));
        b1.display();
        System.out.println("Volume"+b1.getVolume());

    }
}

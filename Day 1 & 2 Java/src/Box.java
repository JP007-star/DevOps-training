public class Box {
    private int height;
    private int length;
    private int width;
    public  void initialize(int h,int l,int w){
        height=h;
        length=l;
        width=w;
    }
    public void display(){
        System.out.println("Height:"+height);
        System.out.println("Length:"+length);
        System.out.println("Width:"+width);
    }
    public void increasedVolume(){
        System.out.println("Height:"+height*(108/100));
        System.out.println("Length:"+length*(110/100));
        System.out.println("Width:"+width*(120/100));
    }
    public int getHeight(){
        return height;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getVolume(){
        return height*length*width;
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        int []array=new int[5];
        array[0]=12;
        array[1]=12;
        array[2]=12;
        array[3]=12;
        array[4]=12;
        System.out.println("Elements in array are:");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}

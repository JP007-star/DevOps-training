import java.util.Scanner;

public class PrintArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i< array.length;i++)
        {
            int a=sc.nextInt();
            array[i]=a*a;
        }
        System.out.println("Numbers are");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}



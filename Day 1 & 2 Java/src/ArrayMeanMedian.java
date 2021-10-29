import java.util.Arrays;
import java.util.Scanner;

public class ArrayMeanMedian {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter the elements");
        for(int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();

        }
        System.out.println("Numbers are");
        double sum=0;

        for(int i=0;i< array.length;i++){
            sum+=array[i];
        }
        double medianNum=0;
        int n=array.length;
        if(n%2==1)
        {
            medianNum=array[(n+1)/2-1];
        }
        else
        {
            medianNum=(array[n/2-1]+array[n/2])/2;
        }
        System.out.println("Avg of gn Arr of numbers is:"+ sum/array.length);
        System.out.println("Median of gn Arr of number is:"+medianNum);
    }
}

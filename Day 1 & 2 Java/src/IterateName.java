import java.util.Scanner;
public class IterateName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a your name:");
        String Name=sc.next();
        System.out.println("Enter a iteration time:");
        int a= sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(Name);
        }

    }
}

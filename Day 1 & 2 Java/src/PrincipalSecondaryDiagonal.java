import java.util.Scanner;

public class PrincipalSecondaryDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col=sc.nextInt();
        int[][] array=new int[row][col];
        System.out.println("Enter the elements");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Principal Diagonal Elements are");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < col; j++) {
                if(i==j)
                System.out.println(array[i][j]+",");
            }
        }
        System.out.println("Secondary Diagonal Elements are");
        for(int i=0;i< row;i++) {
            for (int j = 0; j < col; j++) {
                if ((i + j) == (col - 1))
                    System.out.println(array[i][j] + ",");
            }
        }

    }
}

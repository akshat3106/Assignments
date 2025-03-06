package assignment1.homeassignment;
import java.util.Scanner;
public class homeassignment4 {
    public static double[][] addmatrix(double[][] a, double[][] b) {
        int row = a.length, cols = a[0].length;
        double[][] c = new double[row][cols];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and coloumns");
        int row = sc.nextInt(), cols = sc.nextInt();
        double[][] a = new double[row][cols];
        double[][] b = new double[row][cols];
        System.out.println("enter the elements of first 2d array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of second 2d array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        double[][] result=addmatrix(a,b);
        for(double[] val:result){
            for(double j:val){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
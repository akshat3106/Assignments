package assignment1;
import java.util.Scanner;
public class question9 {
    public static double sum_of_diagonal(double n[][]) {
        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements in the 2d array");
        double[][] n =new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j]=sc.nextDouble();
            }
        }
        for(double[] i:n){
            for(double j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("the sum of the major diagonal is "+sum_of_diagonal(n));
    }
}
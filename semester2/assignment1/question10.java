package assignment1;
import java.lang.foreign.SymbolLookup;
import java.sql.SQLOutput;
import java.util.Scanner;
public class question10 {
    public static double sum_of_coloumn(double [][] n, int j){
        double sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements in 2d array");
        double[][] n=new double[3][4];
        for (int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                n[i][j]=sc.nextDouble();
            }
        }
        System.out.println("the 2d array is like following");
        for(double i[]:n){
            for(double j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int j=0;j<4;j++){
            System.out.println("the sum of coloumn "+j+" is "+sum_of_coloumn(n,j));
        }
    }
}

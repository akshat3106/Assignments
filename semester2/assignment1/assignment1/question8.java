package assignment1;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter no of rows and coloumns");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int n[][]=new int[r][c];
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                n[i][j]=sc.nextInt();
                sum+=n[i][j];
            }
        }
        System.out.println("elements of 2d array are");
        for (int[] i:n){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("the sum of elements of 2d array is "+ sum);



    }
}

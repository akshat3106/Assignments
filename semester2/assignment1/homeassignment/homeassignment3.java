package assignment1.homeassignment;
import java.util.Arrays;
import java.util.Scanner;
public class homeassignment3 {
    public static int[] dotproduct(int[] a, int [] b){
        int n=a.length;
        int[] c=new int[n];
        for (int i=0;i<n;i++){
            c[i]=a[i]*b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int [] b=new int[n];
        System.out.println("enter the elements of 1st array");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the elements of 2nd array");
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int[] result=dotproduct(a,b);
        System.out.println(Arrays.toString(result));
        //for(int i:result){
          //  System.out.print(i+" ");

    }
}

package assignment1;
import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to check");
        int n=sc.nextInt();
        int sum=0;
        int product=1;
        while (n > 0) {
             sum+=n%10;
             product*=n%10;
             n=n/10;
        }
        if(sum==product){
            System.out.println("its a spy number");
        } else {
            System.out.println("its not a spy number");
        }
    }
}

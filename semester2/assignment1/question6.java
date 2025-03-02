package assignment1;
import java.util.Scanner;
public class question6 {
        public static boolean isOdd(int i) {
            return (i & 1) == 1;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number you want to check");
            int n=sc.nextInt();
            System.out.println(isOdd(n));
        }
    }



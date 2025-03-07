package assignment1.homeassignment;
import java.util.*;

public class homeassignment1 {
    public static boolean isarithemetic(int a, int b, int c) {
        return (a + b == c) || (a == b - c) || (a * b == c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a,b and c");
        int a=sc.nextInt(),b= sc.nextInt(),c= sc.nextInt();
        if (isarithemetic(a,b,c)){
            System.out.println("yes,its a valid formula");
        } else{
            System.out.println("not a correct arithemetic formula");
        }

    }
}



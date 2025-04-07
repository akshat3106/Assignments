package assignnemt3;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) throws NumberFormatException {
        System.out.println("enter your lucky number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        try {
            if (n<0){
                throw new NumberFormatException("negative number is not allowed");
            }
            System.out.println("your lucky number is "+n);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}

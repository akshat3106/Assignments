import java.util.Scanner;
public class question5 {
    public static int sum_of_digits(int n){
        if(n<10){
            return n;
        }
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
            }
        return sum_of_digits(sum);
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("sum of the digits "+n+" until the number is a single digit is "+sum_of_digits(n));
    }
    }



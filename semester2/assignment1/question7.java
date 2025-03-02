package assignment1;
import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int elements=sc.nextInt();
        int[] n= new int[elements];
        System.out.println("enter elements");
        for(int i=0;i<elements;i++){
            n[i]=sc.nextInt();
        }
        int countmax=0;
        int countmin=0;
        int max=n[0];
        int min=n[0];
        int firstmax=0;
        int lastmin=0;
        for(int i=0;i<n.length;i++){
            if(n[i]>max) {
                max = n[i];
                countmax=1;
                firstmax=i+1;
            }
            else if(n[i]==max){
                countmax++;
            }
            if(n[i]<min){
                min=n[i];
                countmin=1;
                lastmin=i+1;
            }
            else if(n[i]==min){
                countmin++;
                lastmin=i+1;
            }
        }
        System.out.println("Maximum element of Array is "+max+ " and occurs "+ countmax+" times.");
        System.out.println("Minimum element of Array is "+min+ " and occurs"+ countmin+" times");
        System.out.println("first occurrence of maximum element is at position "+firstmax);
        System.out.println("Last occurrence of minimum element is at position "+lastmin);

    }
}

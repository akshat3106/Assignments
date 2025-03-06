package assignment1.homeassignment;
import java.util.*;
public class homeassignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> lines=new ArrayList<>();
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            if (line.isEmpty()) break;
            lines.add(line);
        }
        sc.close();
        System.out.println("reversed order of lines");
        for(int i=lines.size()-1;i>=0;i--){
            System.out.println(lines.get(i));
        }
    }

}

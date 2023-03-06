import java.util.*;
public class ternaryoper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
       
        String type=(number%2==0)?"even":"odd";
        System.out.print(type);
    }
    
}

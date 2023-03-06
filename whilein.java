import java.util.*;
public class whilein {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        //int counter=1;
        //while(counter<=n){
           // System.out.print(counter+" ");
          //  counter++;
       // }
      int sum=0;
       int i=1;
       while(i<=n){
        sum+=i;
        i++;
         }
         System.out.print("sum is : "+ sum);
    }
    
}

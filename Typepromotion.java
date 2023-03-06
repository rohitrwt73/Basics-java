public class Typepromotion {
    
    public static void main(String args[]){
        //char a ='a';
       // char b ='b';
       // System.out.println((int)(b));
        //System.out.println((int)(a));
        //System.out.println(b-a);(done)
        //int a=10;
        //float b=20.25f;
        //long c=25;
        //double d=30;
        //double ans=a+b+c+d;(all int float long are first converted to double and added)
        //System.out.print(ans);
        //wrong due to type promotion
        //byte b=5;
        //byte a=2*b;
        //right
        byte b =5;
        byte a = (byte)(b*2);
        System.out.println(a);
    }
}

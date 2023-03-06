public class binocoef {
    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f= f*i;
        }
            return f;
        
    }
    public static int binCoeff (int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n -r);
        int binCoeff = fact_n/ (fact_r*fact_nmr); 
        return binCoeff;
    }
    public static int sum( int a,int b){ //sum of 2 numbers.
        return a+b;
    }
    public static int sum(int a,int b,int c){ //sum of 3 numbers.
        return a+b+c;
    }
    public static void main (String args[]){
        System.out.println(sum(8,9));
        System.out.print(sum(8,7,9));
        
        

    }
}



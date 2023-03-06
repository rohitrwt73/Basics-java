public class sol1 {
   public static  int print2largest(int arr[], int n) {
        int largest =0 , res = -1;
        for ( int i =1; i<arr.length; i++){
            if(arr[i]>arr[largest]){
                res  = largest;
                largest = i;
            }
            else if(arr[i] !=  arr[largest]){
                if(res == -1 || arr[i]> arr[res]){
                    res = i;
                }
            } 
            return res;
       } return res; // code here
    }
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        System.out.println(print2largest( arr,n));
        
    }
}

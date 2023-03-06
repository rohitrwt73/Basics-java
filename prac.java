public class prac {
    public static int[] twoSum(int[] nums, int target) {
      
        int [] ans =new int[2];
        for(int i=0; i<nums.length-1; i++){
            int j=i+1;
           
               if(nums[i] + nums[j] == target){
                   ans[0]= i;
                   ans[1]=j;
                 return ans;
                  System.out.println(i+j);
                  
               }

                   }return ans;
    }
    
    public static void main(String args[]){
        int nums[] = {3,2,3};
        int target =6;
       twoSum(nums,target);
         
        
       }
}       
 
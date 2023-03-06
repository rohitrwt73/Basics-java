public class arraysSol1 {
    public static boolean containDuplicate(int nums[]){
        for(int i = 0;i<nums.length -1;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        } return false;
    }
    public static void main(String[] args) {
        int nims[]={1,2,3,4,5};
    System.out.println(containDuplicate(nims)); 
    }
    
}
//alternative method
/*class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return false;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
        
    }

    public void main (String args[]){
        int nums[]= {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }
}
    */

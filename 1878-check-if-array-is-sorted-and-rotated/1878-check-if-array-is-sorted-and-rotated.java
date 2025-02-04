class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, count = 0;
        for(int i = 0; i<n*2; i++){
            if(count >= n-1){
                return true;
            }
            if(nums[i%n] <= nums[(i+1)%n]){
                count++;
                
            }
            else{
                count = 0;
            }
        }
        
        return false;
    }
}
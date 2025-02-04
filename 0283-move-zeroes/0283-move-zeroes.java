class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        if(nums.length > 1){
            for(int k = nums.length-1; k>=j; k--){
                nums[k] = 0;
            }
        }

    }
}
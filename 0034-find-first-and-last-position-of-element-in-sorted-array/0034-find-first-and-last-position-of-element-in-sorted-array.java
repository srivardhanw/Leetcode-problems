class Solution {
    public static int findStart(int[] nums, int target){
        int l = 0, r = nums.length-1;
        int mid, start = -1;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                start = mid;
                r = mid-1;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
        }
        return start;
    }
    public static int findEnd(int[] nums, int target){
        int l = 0, r = nums.length-1;
        int mid, end = -1;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                end = mid;
                l = mid+1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
        }
        return end;
    }
    public int[] searchRange(int[] nums, int target) {
        int s = findStart(nums, target);
        int e = findEnd(nums,target);
        return new int[]{s, e};
    }
}
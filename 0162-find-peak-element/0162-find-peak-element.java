class Solution {
    //we calculate the mid and check if the element at mid pos is peak or not
    //if mid we return or else we check if the mid is on the increasing slope or the decreasing slope and change the l and r ranges accordingly.
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 0;
        }
        else if(nums[0] > nums[1]){
            return 0;
        }
        else if(nums[n-1] > nums[n-2]){
            return n-1;
        }
        else{
            int l = 1, r = n-2;
            int mid, ans=-1;
            while(l <= r){
                mid = l+(r-l)/2;
                if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]){
                    return mid;
                }
                else if(nums[mid-1] < nums[mid] && nums[mid+1] > nums[mid]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
            return -1;
        }
    }
}

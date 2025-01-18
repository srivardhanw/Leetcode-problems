class Solution {
public:
    int findStart(vector<int> &nums, int target){
        int l = 0, r = nums.size()-1;
        int mid, start = -1;
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                start = mid;
                r = mid-1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return start;
    }
    int findEnd(vector<int> &nums, int target){
        int l = 0, r = nums.size()-1;
        int mid, end = -1;
        while(l <= r){
            mid = l+(r-l)/2;
            if(nums[mid] == target){
                end = mid;
                l = mid+1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return end;
    }
    vector<int> searchRange(vector<int>& nums, int target) {
        int start = findStart(nums,target);
        int end = findEnd(nums, target);
        vector<int> res = {start, end};
        return res;
    }
};
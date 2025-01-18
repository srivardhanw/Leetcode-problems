class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int size = letters.size();
        char res;
        if(letters[size-1] <= target) res = letters[0];
        else{
            int l = 0, r = size-1;
            int mid;
            while(l<=r){
                mid = l+(r-l)/2;
                if(letters[mid] <= target)
                    l = mid+1;
                else if(letters[mid] > target){
                    res = letters[mid];
                    r = mid-1;
                } 
                 
            }
        }
        return res;
    }
};
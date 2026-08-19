class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int r=nums.length-1;
        while(left<=r){
            int mid=left+(r-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                r=mid-1;
            }
        }
      return -1;
    }
}
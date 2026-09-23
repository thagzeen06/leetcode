class Solution {
    public int minOperations(int[] nums, int x) {
        int tot=0;
        for(int k:nums){
            tot+=k;
        }
          int n=nums.length;
        int tar=tot-x;
        if(tar<0) return -1;
        if(tar==0) return n;
        int sum=0;
        int max=-1;
        int left=0;
      
        for(int r=0;r<n;r++){
            sum+=nums[r];
            while(left<=r && sum>tar){
                sum-=nums[left];
                left++;
            }
            if(tar==sum){
              max=Math.max(max,r-left+1);
            }
        }
        return max==-1?-1:n-max;
    }
}
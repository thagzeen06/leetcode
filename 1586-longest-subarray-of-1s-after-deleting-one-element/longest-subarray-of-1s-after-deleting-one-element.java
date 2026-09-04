class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int max=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               zero++;
            }
            while(zero>1){
                if(nums[left]==0) zero--;
                left++;
               
            }
            max=Math.max(max,i-left);
        }
        return max;
    }
}
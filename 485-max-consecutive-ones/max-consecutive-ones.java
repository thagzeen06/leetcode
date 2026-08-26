class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int n=nums.length;
        int co=0;
       for(int i=0;i<n;i++){
        if(nums[i]==1){
            co++;
            max=Math.max(co,max);
        }else{
            co=0;
        }
       }
        
        return max;
    }
}
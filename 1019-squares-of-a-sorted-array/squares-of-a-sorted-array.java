class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int k=n-1;
        int[] res=new int[n];
        while(left<=right){
            int a=Math.abs(nums[left]);
            int b=Math.abs(nums[right]);
           
            if(a<=b){
                res[k]=b*b;
                right--;
            }
            else{
                res[k]=a*a;
                left++;
            }
            k--;
        }
        return res;
    }
}
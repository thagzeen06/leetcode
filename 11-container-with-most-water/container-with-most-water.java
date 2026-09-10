class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;

        int max=0;
        while(left<right){
            int hig=Math.min(height[left],height[right]);
            int len=right-left;
            int area =len*hig;
            if(height[left]<height[right]){
                left++;
            }else{
                right--; 
            }
            max=Math.max(max,area);
        }
        return max;
    }
}
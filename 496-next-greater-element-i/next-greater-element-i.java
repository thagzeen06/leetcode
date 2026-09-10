class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();

        for(int x:nums2){
            while(!s.isEmpty() && s.peek()<x){
              map.put(s.pop(),x);
            }
            s.push(x);
        }
        while(!s.isEmpty()){
            map.put(s.pop(),-1);
        }
        int n=nums1.length;
        for(int i=0;i<n;i++){
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}
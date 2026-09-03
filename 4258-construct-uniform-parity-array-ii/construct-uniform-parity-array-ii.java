class Solution {
    public boolean uniformArray(int[] nums1) {
        int m=Integer.MAX_VALUE;
        int me=Integer.MAX_VALUE;
            int oc=0,ece=0;
        for(int x:nums1){
            if(x%2==0){
                ece++;
                me=Math.min(me,x);
                
            }else{
                oc++;
                m=Math.min(m,x);
            }
        }
        if(oc==0||ece==0)return true;
        if(m<me) return true;
        return false;
    }
}
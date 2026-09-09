class Solution {
    public long countCommas(long n) {
        long res=0;
        long pow=1000;
        for(int i=1;i<=5;i++){
            res+=Math.max(0L,n-(pow-1));
            pow*=1000;
        }
        return res;
    }
}
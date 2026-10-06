class Solution {
    public int hammingWeight(int n) {
        int co=0;
        while(n!=0){
            n=n&(n-1);
            co++;
        }
        return co;
    }
}
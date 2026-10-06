class Solution {
    public int hammingDistance(int x, int y) {
        int n=x^y;
        int co=0;
        while(n!=0){
           co+=n&1;
           n=n>>1; 
        }
        return co;
    }
}
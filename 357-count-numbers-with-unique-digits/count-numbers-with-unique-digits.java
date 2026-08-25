class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int a=10;
        int b=9;
        int c=9;
        if(n==0){
            return 1;
        }
            for(int i=2;i<=n;i++){
                b=b*c;
                a+=b;
                c--;
            }
        
        return a;
    }
}
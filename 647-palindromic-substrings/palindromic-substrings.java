class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            count+=palin(s,i,i);
             count+=palin(s,i,i+1);

        }
        return count;
    }
    private int palin(String s,int left,int right){
        int co=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            co++;
            left--;
            right++;
        }
        return co;
    }
}
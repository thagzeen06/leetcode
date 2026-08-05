class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] co=new int[26];
        for(char a:magazine.toCharArray()){
            co[a-'a']++;
        }
        for(char b:ransomNote.toCharArray()){
            if(co[b-'a']==0){
                return false;
            }
            co[b-'a']--;
        }
        return true;
    }
}
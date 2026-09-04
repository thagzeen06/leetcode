class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        if(n<3) return false;
        int vo=0,co=0;
        for(char c:s.toCharArray()){
               if (!((c >= 'A' && c <= 'Z') ||
                  (c >= 'a' && c <= 'z') ||
                  (c >= '0' && c <= '9'))) {

                return false;
                  }
             if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U'){
            vo++;
           }   else if ((c >= 'A' && c <= 'Z') ||
                     (c >= 'a' && c <= 'z')) {

            co++;
           }
        
        }
       return vo>=1&& co>=1;
    }
}
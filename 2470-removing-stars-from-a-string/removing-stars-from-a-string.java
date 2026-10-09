class Solution {
    public String removeStars(String s) {
        Stack<Character> k=new Stack<>();
        for(char c:s.toCharArray()){
          
                if(c=='*'){
                    k.pop();
                }else{
                    k.push(c);
            
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char a:k){
            sb.append(a);
        }
        return sb.toString();
    }
}
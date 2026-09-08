class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int co=0;
        for(int x:nums){
            set.add(x);

        }
        for(int x:set){
          if(!set.contains(x-1)){
            
                int curco=1;
                while(set.contains(x+curco)){
                    curco++;
                }
                co=Math.max(co,curco);
            }
        }
        return co;
    }
}
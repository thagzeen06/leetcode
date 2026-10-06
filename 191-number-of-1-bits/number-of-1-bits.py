class Solution:
    def hammingWeight(self, n: int) -> int:
        co=0
        while n!=0 :
            n=n&(n-1)
            co+=1

        return co    
        
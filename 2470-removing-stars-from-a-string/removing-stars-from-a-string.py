class Solution:
    def removeStars(self, s: str) -> str:
        statck=[]
        for c in s :
            if c=='*':
                statck.pop()
            else:
                statck.append(c)

        return ''.join(statck)
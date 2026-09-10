class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int key=arr[1]-arr[0];

for(int i=1;i<n;i++){
    if(key!=arr[i]-arr[i-1]){
        return false;
    }
}
return true;
    }
}
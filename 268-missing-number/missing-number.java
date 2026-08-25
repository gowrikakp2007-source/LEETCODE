class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int a=n*(n+1)/2;
        int c=0;
        for (int b:nums){
            c=c+b;

        }
        return a-c;
        
    }
}
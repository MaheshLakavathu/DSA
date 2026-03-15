1class Solution {
2    public int missingNumber(int[] nums) {
3        int sum=0;
4        int n=nums.length;
5        for(int i=0;i<nums.length;i++){
6            sum+=nums[i];
7        }
8        int exp=n*(n+1)/2;
9        int exp1=exp-sum;
10        return exp1;
11
12    }
13}
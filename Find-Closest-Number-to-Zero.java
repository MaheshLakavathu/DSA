1class Solution {
2    public int findClosestNumber(int[] nums) {
3
4        int ans = nums[0];
5
6        for(int i=1;i<nums.length;i++){
7
8            if(Math.abs(nums[i]) < Math.abs(ans) ||
9              (Math.abs(nums[i]) == Math.abs(ans) && nums[i] > ans)){
10
11                ans = nums[i];
12            }
13        }
14
15        return ans;
16    }
17}
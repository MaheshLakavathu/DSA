1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int count=0;
4        int ans=0;
5        for(int i=0;i<nums.length;i++){
6            if(nums[i]==1){
7                count++;
8            }
9            else{
10                count=0;
11            }
12            ans=Math.max(ans,count);
13        } 
14        return ans;
15    }
16}
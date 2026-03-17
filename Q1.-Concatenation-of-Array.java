1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int arr[]=new int[2*nums.length];
4        int n=arr.length;
5        for(int i=0;i<nums.length;i++){
6            arr[i]=nums[i];
7            arr[(n/2)+i]=nums[i];
8            
9        }
10        return arr;
11    }
12}
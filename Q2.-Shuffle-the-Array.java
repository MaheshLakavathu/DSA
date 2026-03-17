1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int arr[]=new int[nums.length];
4        int k=0;
5        for(int i=0;i<n;i++){
6            arr[k++]=nums[i];
7            arr[k++]=nums[(n)+i];
8            
9        }
10        return arr;
11    }
12}
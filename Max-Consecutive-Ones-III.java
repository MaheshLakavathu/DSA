1class Solution {
2    public int longestOnes(int[] arr, int k) {
3        int ans=0;
4		int count=0;
5		int l=0;
6		for(int r=0;r<arr.length;r++){
7		    if(arr[r]==0){
8		        count++;
9		    }
10		    while(count>k){
11		       if(arr[l]==0){
12		           count--;
13		           
14		       } 
15               l++;
16		      
17		    }
18		     ans=Math.max(ans,r-l+1);
19		}
20        return ans;
21    }
22}
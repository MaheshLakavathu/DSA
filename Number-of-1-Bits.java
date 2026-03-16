1class Solution {
2    public int hammingWeight(int n) {
3        int count=0;
4        while(n!=0){
5        if((n&1)==1){
6            count++;
7        }
8       n= n>>1;
9        }
10        return count;
11    }
12}
1class Solution {
2    public int findClosest(int x, int y, int z) {
3        int a=Math.abs(x-z);
4        int b=Math.abs(y-z);
5        if(a==b) {
6            return 0;
7        }
8        else if(a>b){
9            return 2;
10        }
11        else{
12            return 1;
13        }
14
15    }
16}
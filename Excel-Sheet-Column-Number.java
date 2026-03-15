1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int res = 0;
4
5        for(int i=0; i<columnTitle.length();i++){
6           int  val = columnTitle.charAt(i)-'A'+1;
7            
8            res = res*26+val;
9        }
10        return res;
11    }
12}
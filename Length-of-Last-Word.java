1class Solution {
2    public int lengthOfLastWord(String s) {
3
4        int count = 0;
5        int i = s.length() - 1;
6        while(i >= 0 && s.charAt(i) == ' '){
7            i--;
8        }
9        while(i >= 0 && s.charAt(i) != ' '){
10            count++;
11            i--;
12        }
13
14        return count;
15    }
16}
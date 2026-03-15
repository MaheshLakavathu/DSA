1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        for(int i = 0; i <= haystack.length() - needle.length(); i++){
5
6            if(haystack.substring(i, i + needle.length()).equals(needle)){
7                return i;
8            }
9        }
10
11        return -1;
12    }
13}
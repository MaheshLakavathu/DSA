1import java.util.*;
2
3class Solution {
4    public int romanToInt(String s) {
5        HashMap<Character, Integer> hm = new HashMap<>();
6        hm.put('I', 1);
7        hm.put('V', 5);
8        hm.put('X', 10);
9        hm.put('L', 50);
10        hm.put('C', 100);
11        hm.put('D', 500);
12        hm.put('M', 1000);
13
14        int sum = 0;
15
16        for (int i = 0; i < s.length(); i++) {
17            if (i < s.length() - 1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i + 1))) {
18                sum -= hm.get(s.charAt(i));
19            } else {
20                sum += hm.get(s.charAt(i));
21            }
22        }
23
24        return sum;
25    }
26}
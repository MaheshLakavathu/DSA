1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5        Stack<Character> sc = new Stack<>();
6        for(int i = 0; i < s.length(); i++)
7         {
8            char ch = s.charAt(i);
9            if(ch == '(' || ch == '{' || ch == '[')
10             {
11                sc.push(ch);
12            } 
13            else {
14                if(sc.isEmpty()) return false;
15                char top = sc.peek();
16                if((ch == ')' && top == '(') ||
17                   (ch == '}' && top == '{') ||
18                   (ch == ']' && top == '[')) {
19                    sc.pop();
20                } else {
21                    return false;
22                }
23            }
24        }
25        return sc.isEmpty(); 
26    }
27}
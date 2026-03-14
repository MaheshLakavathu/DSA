1import java.util.*;
2
3class Solution {
4    public int totalFruit(int[] fruits) {
5
6        int l = 0;
7        int ans = 0;
8
9        HashMap<Integer,Integer> hm = new HashMap<>();
10
11        for(int r = 0; r < fruits.length; r++){
12
13            hm.put(fruits[r], hm.getOrDefault(fruits[r],0) + 1);
14
15            while(hm.size() > 2){
16
17                hm.put(fruits[l], hm.get(fruits[l]) - 1);
18
19                if(hm.get(fruits[l]) == 0){
20                    hm.remove(fruits[l]);
21                }
22
23                l++;
24            }
25
26            ans = Math.max(ans, r - l + 1);
27        }
28
29        return ans;
30    }
31}
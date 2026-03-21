1import java.util.*;
2
3class Solution {
4    public List<Integer> findDisappearedNumbers(int[] nums) {
5        List<Integer> result = new ArrayList<>();
6        boolean[] present = new boolean[nums.length + 1];
7        for(int num : nums){
8            present[num] = true;
9        }
10        for(int i = 1; i <= nums.length; i++){
11            if(!present[i]){
12                result.add(i);
13            }
14        }
15
16        return result;
17    }
18}
1class Solution {
2    public int maxFrequencyElements(int[] nums) {
3         HashMap<Integer,Integer>hm=new HashMap<>();
4        for(int i=0;i<nums.length;i++){
5            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
6        }
7        int max=0;
8        for(int val:hm.values()){
9            max=Math.max(max,val);
10        }
11        int count=0;
12        for(int val:hm.values()){
13            if(val==max){
14                count++;
15            }
16        }
17        return count*max;
18    }
19}
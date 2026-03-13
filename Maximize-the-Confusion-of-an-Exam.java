1class Solution {
2    public int maxConsecutiveAnswers(String s, int k) {
3        int count0=0;
4        int count1=0;
5        int l=0;
6        int ans=0;
7        for(int r=0;r<s.length();r++){
8            if(s.charAt(r)=='T'){
9                count0++;
10            }
11            else{
12                count1++;
13            }
14            while(Math.min(count0,count1)>k){
15                if(s.charAt(l)=='T'){
16                    count0--;
17                }
18                else{
19                    count1--;
20                }
21                l++;
22            }
23            ans=Math.max(ans,r-l+1);
24        }
25        return ans;
26    }
27}
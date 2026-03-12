1class Solution {
2    public int minimumCost(int[] cost) {
3        int took=0;
4        Arrays.sort(cost);
5        int sum=0;
6        for(int i=cost.length-1;i>=0;i--){
7            if(took==2){
8                took=0;
9            }
10            else{
11                sum+=cost[i];
12                took++;
13            }
14        }
15        return sum;
16    }
17}
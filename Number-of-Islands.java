1class Solution {
2    public void dfs(int i,int j,boolean [][] vis,char[][] grid){
3        int n=grid.length;
4        int m=grid[0].length;
5        if(i<0||j<0||i>=n||j>=m||vis[i][j]||grid[i][j]=='0'){
6            return ;
7        }
8        vis[i][j]=true;
9        dfs(i+1,j,vis,grid);
10        dfs(i-1,j,vis,grid);
11        dfs(i,j+1,vis,grid);
12        dfs(i,j-1,vis,grid);
13    }
14    public int numIslands(char[][] grid) {
15        int n=grid.length;
16        int m=grid[0].length;
17        int count=0;
18        boolean[][]visited=new boolean [n][m];
19        for(int i=0;i<n;i++){
20            for(int j=0;j<m;j++){
21                if(grid[i][j]=='1'&&!visited[i][j]){
22                    count++;
23                dfs(i,j,visited,grid);
24                }
25            }
26        }
27        return count;
28    }
29    
30}
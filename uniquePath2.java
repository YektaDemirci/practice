class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1)
            return 0;
        obstacleGrid[0][0]=1;
        for(int i=1;i<col;i++)
            obstacleGrid[0][i] = (obstacleGrid[0][i]==0 && obstacleGrid[0][i-1]==1) ? 1 : 0;
        for(int i=1;i<row;i++)
            obstacleGrid[i][0] = (obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1) ? 1 : 0;
        for(int i=1; i<row; i++) {
            for(int j=1; j<col; j++) {
                obstacleGrid[i][j] = (obstacleGrid[i][j] != 1) ? obstacleGrid[i-1][j] + obstacleGrid[i][j-1] : 0;  
            }
        }
        return obstacleGrid[row-1][col-1];
    }
}


/*Failed solution, can not come from the finish line to the start if the path is blocked
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //System.out.println(obstacleGrid[0].length);
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        //System.out.println(row+" "+col);
        int[][] map = new int[row][col];
        for(int i=0; i < row; i++) {
            for(int j=0; j < col; j++) {
                if(obstacleGrid[i][j] == 1)
                    map[i][j] = 0;
                else
                    map[i][j] = -1;
            }
        }
        if (obstacleGrid[0][0] == 1 || obstacleGrid[row-1][col-1] == 1)
            return 0;
        else
            //System.out.println(Arrays.deepToString(map));
            return mapFiller(row-1,col-1,map,obstacleGrid);
    }
    
    public int mapFiller(int i, int j, int[][] map, int[][] obstacleGrid){
        //System.out.println(i+" "+j);
        if( (i==0) || (j==0) )
            return 1;
        if(map[i-1][j]==-1) { map[i-1][j] = mapFiller(i-1, j, map, obstacleGrid);}
        if(map[i][j-1]==-1) { map[i][j-1] = mapFiller(i, j-1, map, obstacleGrid);}
        return map[i-1][j] + map[i][j-1];
    }
}
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length;
        int columns=grid[0].length;
        int countnegative=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(grid[i][j]<0)
                {
                    countnegative+=columns-j;
                    break;
                }
            }
        }
        return countnegative;
    }
}
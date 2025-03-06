class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int sum=0,a=0;
        int n=grid.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               if(set.contains(grid[i][j]))
                    a=grid[i][j];
                else
                  {
                sum+=grid[i][j];
                set.add(grid[i][j]);
                  }

            }
        }
        n*=n;
        return new int[]{a,(n+1)*n/2-sum};
    }
}
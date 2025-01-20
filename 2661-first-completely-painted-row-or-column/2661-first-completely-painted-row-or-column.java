class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
     int rows=mat.length;
     int cols=mat[0].length;
     Map<Integer,int[]> pos=new HashMap<>();
     int[] rc=new int[rows];
     int[] cc=new int[cols];
     Arrays.fill(rc,cols);
     Arrays.fill(cc,rows);
     for(int i=0;i<rows;i++)
     {
        for(int j=0;j<cols;j++)
        {
            pos.put(mat[i][j],new int[]{i,j});
        }
     }
     int n=arr.length;
     for(int i=0;i<n;i++)
     {
        int[] ip=pos.get(arr[i]);
        if(--rc[ip[0]]==0||--cc[ip[1]]==0)
        return i;
     }
     return -1;
    }
}
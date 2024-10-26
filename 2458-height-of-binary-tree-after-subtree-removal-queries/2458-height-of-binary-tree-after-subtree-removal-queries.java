/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int depth[];
    int levelarr[];
    int max1[];
    int max2[];
    public int solve(TreeNode root,int level)
    {
        if(root==null)
          return 0;
        levelarr[root.val]=level;
        depth[root.val]=1+Math.max(solve(root.left,level+1),solve(root.right,level+1));
        if(max1[level]<depth[root.val])
          {
            max2[level]=max1[level];
            max1[level]=depth[root.val];

          }
          else if(max2[level]<depth[root.val])
          {
            max2[level]=depth[root.val];
          }
          return depth[root.val];
    }
    public int[] treeQueries(TreeNode root, int[] queries) {
        depth=new int[100001];
        levelarr=new int[100001];
        max1=new int[100001];
        max2=new int[100001];
        solve(root,0);
        for(int i=0;i<queries.length;i++)
        {
            int q=queries[i];
            int level=levelarr[q];
            queries[i]=(max1[level]==depth[q]?max2[level]:max1[level])+level-1;
        }
        
        return queries;
    }
}
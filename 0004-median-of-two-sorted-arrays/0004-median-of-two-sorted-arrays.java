class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1=nums1.length;
       int n2=nums2.length;
       int n=n1+n2,i=0,j=0,k=0;
       int arr[]=new int[n];
       System.out.println(n);
        while(k<n)
        {
           while(j==n2&&i<n1||i<n1&&nums1[i]<=nums2[j])
           { 
              arr[k]=nums1[i];
              k++;
              i++;
           }
           while(i==n1&&j<n2||j<n2&&nums2[j]<nums1[i])
           {
                arr[k]=nums2[j];
                k++;
                j++;
                
           }
        }
        return n%2==0?(double)(arr[n/2]+arr[n/2-1])/2:arr[n/2];
    }
}
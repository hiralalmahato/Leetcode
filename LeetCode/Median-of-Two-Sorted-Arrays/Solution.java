1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n1 = nums1.length;
4        int n2 =nums2.length;
5
6        if(n1>n2){
7            return findMedianSortedArrays(nums2,nums1);
8        }
9
10        int low =0;
11        int high = n1;
12        int left = (n1+n2+1)/2;
13        int n = n1+n2;
14
15        while(low<=high){
16            int mid1 = (low+high)/2;
17            int mid2 = left - mid1;
18            int l1=Integer.MIN_VALUE;int l2 = Integer.MIN_VALUE;
19            int r1 =Integer.MAX_VALUE;int r2= Integer.MAX_VALUE;
20
21            if(mid1<n1){
22                r1 = nums1[mid1];
23            }
24            if(mid2<n2){
25                r2 = nums2[mid2];
26            }
27
28            if(mid1-1>=0){
29                l1 = nums1[mid1-1];
30            }
31            if(mid2-1>=0){
32                l2 = nums2[mid2-1];
33            }
34
35            if(l1<=r2 && l2<=r1){
36                if(n%2==1){
37                    return Math.max(l1,l2);
38                }
39                return ((double)(Math.max(l1,l2)+Math.min(r1,r2)))/2.0;
40
41            }
42            else if(l1>r2){
43                high = mid1-1;
44            }
45            else{
46                low = mid1+1;
47            }
48
49
50            
51        }
52        return 0;
53        
54    }
55}
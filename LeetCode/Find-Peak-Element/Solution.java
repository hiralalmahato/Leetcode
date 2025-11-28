1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n =nums.length;
4        int low = 0;
5        int high = n-1;
6
7        if(n==1){
8            return 0;
9        }
10        if(nums[0]>nums[1]){
11            return 0;
12        }
13        if(nums[n-1]>nums[n-2]){
14            return n-1;
15        }
16        low = low+1;
17        high = high-1;
18
19
20        while(low<=high){
21            int mid = (low + high)/2;
22             
23             if(nums[mid] > nums[mid-1] && nums[mid]>nums[mid + 1]){
24                return mid;
25             }
26             else if(nums[mid]>nums[mid - 1]){
27                low = mid + 1;
28
29             }else{
30                high = mid-1;
31             }
32
33        }
34        return -1;
35    }
36}
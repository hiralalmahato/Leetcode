1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int n = nums.length;
4        int low = 0;
5        int high = n-1;
6
7        if(n==1){
8            return nums[0];
9        }
10        if(nums[0]!=nums[1]){
11            return nums[0];
12        }
13        if(nums[n-1]!=nums[n-2]){
14            return nums[n-1];
15        }
16
17        low = 1;
18        high = n-2;
19
20        while(low<=high){
21            int mid = (low+high)/2;
22
23            if(nums[mid]!=nums[mid-1] && nums[mid] !=nums[mid+1]){
24                return nums[mid];
25            }
26
27
28            //eliminate left half
29            if((mid % 2 ==1 && nums[mid-1]==nums[mid]) || (mid % 2==0 && nums[mid+1]==nums[mid])){
30                low = mid +1;
31            }
32            else{
33                high = mid -1;
34            }
35        }
36        return -1;
37        
38    }
39}
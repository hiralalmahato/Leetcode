1class Solution {
2    public int search(int[] nums, int target) {
3
4        
5    int left = 0;
6    int  right = nums.length-1;
7
8
9    while(left<=right) {
10        int  mid  = left +(right-left)/2;
11
12        if(nums[mid]==target){
13            return mid;
14        }
15
16        if(nums[left]<=nums[mid]){
17            if(nums[left]<=target && target<nums[mid]){
18                right = mid -1;
19            }else{
20                left = mid + 1;
21            }
22        }
23        else{
24            if(nums[right]>=target && target > nums[mid]){
25                left = mid +1;
26            }
27            else{
28                right = mid -1;
29            }
30        }
31    }
32    return -1;
33    }
34}
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73// int left = 0;
74//         int right  = nums.length -1;
75
76//         while(left<=right){
77//             int mid = left + (right - left) /2;
78
79//             if(nums[mid]==target){
80//                 return mid;
81//             }
82
83//             if(nums[left] <=nums[mid]){
84//                 if(nums[left]<=target && target<nums[mid]){
85//                     right = mid-1;
86//                 }
87//                 else{
88//                     left = mid +1;
89//                 }
90
91//             }
92
93
94//             else{
95//                 if(nums[right]>=nums[mid]){
96//                     if(nums[right]>=target && target>nums[mid]){
97//                         left = mid +1;
98//                     }else{
99//                         right = mid-1;
100//                     }
101//                 }
102//             }
103//         }
104//         return -1;
105
106
107
108
109
110
111
112
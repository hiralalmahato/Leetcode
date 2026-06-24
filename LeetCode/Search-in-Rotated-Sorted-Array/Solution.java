1class Solution {
2    public int search(int[] nums, int target) {
3
4        int left = 0;
5        int right  = nums.length -1;
6
7        while(left<=right){
8            int mid = left + (right - left) /2;
9
10            if(nums[mid]==target){
11                return mid;
12            }
13
14            if(nums[left] <=nums[mid]){
15                if(nums[left]<=target && target<nums[mid]){
16                    right = mid-1;
17                }
18                else{
19                    left = mid +1;
20                }
21
22            }
23
24
25            else{
26                if(nums[right]>=nums[mid]){
27                    if(nums[right]>=target && target>nums[mid]){
28                        left = mid +1;
29                    }else{
30                        right = mid-1;
31                    }
32                }
33            }
34        }
35        return -1;
36        
37
38        
39        
40    }
41}
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
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
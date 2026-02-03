1// class Solution {
2//     public List<List<Integer>> threeSum(int[] nums) {
3
4//         Set<List<Integer>> set = new HashSet<>();
5//         int sum =0;
6//         for(int i =0;i<nums.length;i++){
7//             for(int j = i+1;j<nums.length;j++){
8//                 for(int k =j+1;k<nums.length;k++){
9
10//                    if(nums[i] + nums[j] + nums[k]==0){
11//                      ArrayList<Integer> list = new ArrayList<Integer>(
12//                         Arrays.asList(nums[i],nums[j],nums[k]));
13
14//                         Collections.sort(list);
15//                         set.add(list);
16                    
17//                    }
18                    
19//                 } 
20//             }
21//         }
22//         return new ArrayList<>(set);
23        
24//     }
25// }
26
27class Solution {
28    public List<List<Integer>> threeSum(int[] nums) {
29
30        List<List<Integer>> result = new ArrayList<>();
31        Arrays.sort(nums); 
32
33        for (int i = 0; i < nums.length; i++) {
34
35         
36            if (i > 0 && nums[i] == nums[i - 1]) continue;
37
38            int left = i + 1;
39            int right = nums.length - 1;
40
41            while (left < right) {
42
43                int sum = nums[i] + nums[left] + nums[right];
44
45                if (sum == 0) {
46                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
47
48                    left++;
49                    right--;
50
51                   
52                    while (left < right && nums[left] == nums[left - 1]) {
53                        left++;
54                    }
55
56                    
57                    while (left < right && nums[right] == nums[right + 1]) {
58                        right--;
59                    }
60                }
61                else if (sum < 0) {
62                    left++; 
63                }
64                else {
65                    right--;
66                }
67            }
68        }
69        return result;
70    }
71}
72
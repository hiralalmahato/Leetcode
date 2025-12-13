1class Solution {
2    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
3
4        List<String> electronics = new ArrayList<>();
5        List<String> grocery = new ArrayList<>();
6        List<String> pharmacy = new ArrayList<>();
7        List<String> restaurant = new ArrayList<>();
8
9
10        for(int i = 0;i<code.length;i++){
11
12            if(!isActive[i]){
13                continue;
14            }
15            if(code[i].isEmpty()){
16                continue;
17            }
18            if(!code[i].matches("[a-zA-Z0-9_]+")){
19                continue;
20            }
21
22            switch (businessLine[i]){
23                case "electronics":
24                electronics.add(code[i]);
25                break;
26
27                case "grocery":
28                grocery.add(code[i]);
29                break;
30
31                case "pharmacy":
32                pharmacy.add(code[i]);
33                break;
34
35                case "restaurant":
36                restaurant.add(code[i]);
37                break;
38
39                default:
40            }         
41
42        }
43        Collections.sort(electronics);
44        Collections.sort(grocery);
45        Collections.sort(pharmacy);
46        Collections.sort(restaurant);
47
48        List<String> result = new ArrayList<>();
49
50        result.addAll(electronics);
51        result.addAll(grocery);
52        result.addAll(pharmacy);
53        result.addAll(restaurant);
54
55        return result;
56        
57
58        
59    }
60}
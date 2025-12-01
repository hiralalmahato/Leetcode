1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int low = 0;int high = arr.length -1;
4        while(low<=high){
5            int mid = (low+high)/2;
6            int missing = arr[mid]-(mid+1);
7
8            if(missing<k){
9                low = mid +1;
10            }else{
11                high =mid -1;
12            }
13        }
14        return k+low;
15        
16    }
17}
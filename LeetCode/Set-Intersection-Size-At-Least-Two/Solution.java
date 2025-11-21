import java.util.*;

class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        // Step 1: Sort intervals
        Arrays.sort(intervals, (a,b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int a = -1, b = -1;  // last two picked numbers
        int count = 0;

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            // Case 1: both a and b already in this interval
            if (a >= start && b >= start) {
                continue;
            }

            // Case 2: only b is inside → add one more number
            if (b >= start) {
                a = b;
                b = end;
                count += 1;
            }
            // Case 3: none inside → add two numbers
            else {
                a = end - 1;
                b = end;
                count += 2;
            }
        }

        return count;
    }
}

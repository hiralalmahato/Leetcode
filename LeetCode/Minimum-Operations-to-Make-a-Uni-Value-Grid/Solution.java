class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-28                                             #
        #                                                                       #
        #########################################################################
        */
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;
        int[] mat = new int[m * n];
        int ans = 0;

        int k = 0;

        for (int[] j : grid)
            for (int i : j)
                mat[k++] = i;

        Arrays.sort(mat);

        // fnding anamoly

        k = mat[0];

        for (int i : mat)
            if ((i - k) % x != 0)
                return -1;

        int mid = mat[n * m / 2];

        for (int i : mat)
            ans += (Math.abs(i - mid) / x);

        return ans;
    }
}
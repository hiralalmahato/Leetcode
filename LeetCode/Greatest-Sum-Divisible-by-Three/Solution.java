class Solution{
    public int maxSumDivThree(int[] nums) {
      int[] dp = new int[]{0, Integer.MIN_VALUE, Integer.MIN_VALUE};

       for (int num : nums) {
        int[] ndp = dp.clone();
        for (int r = 0; r < 3; r++) {
            if (dp[r] == Integer.MIN_VALUE) continue;
            int newR = (r + num % 3) % 3;
            ndp[newR] = Math.max(ndp[newR], dp[r] + num);
        }
        dp = ndp;
    }

    return Math.max(0, dp[0]);
}
}

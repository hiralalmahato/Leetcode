    for i in range(len(nums)):
        odd = set()
        even = set()

        for j in range(i, len(nums)):
            if nums[j] & 1:
                odd.add(nums[j])
            else:
                even.add(nums[j])

            if len(odd) == len(even):
                max_len = max(max_len, j - i + 1)

    return max_len

    
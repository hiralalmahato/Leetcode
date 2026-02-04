class Solution:
    def maxSumTrionic(self, nums: List[int]) -> int:
        '''
        1. find the indexes [l,r] with a `decreasing segment`
           and store (l, r, sum)
           this is the 'core' we will use to grow our array in part 2.

        [0,-2,-1,-3,0,2,-1]
         \\\\  \\\\   \\\\
        --> this should return {(0, 1, -2), (2, 3, -4), (5, 6, 1)}
            notice only (2,3) will form a valid trionic array
            -- we will get to this in pt2
        '''

        # the append and pop of inf is to ensure the 
        # ending subsequence gets added
        nums.append(float('inf'))

        decreasing = set()

        windowSize= 0
        curSum = nums[0]
        for i in range(1, len(nums)):
            if nums[i-1] > nums[i]:
                curSum+=nums[i]
                windowSize+=1
            else:
                if windowSize>0:
                    decreasing.add((i-1-windowSize, i-1, curSum))
                windowSize= 0
                curSum = nums[i]

        nums.pop()
        
        '''
        2. for each 'core', try and grow the left and right
           windows as long as the windows match the criteria 
           of increasing sequence.
        '''
        res = -float('inf')

        for l,r,curRes in decreasing:
            # we must track BOTH max seen so far and cur
            maxR = curR = None
            for itrR in range(r+1, len(nums)):
                if nums[itrR-1] >= nums[itrR]:
                    break
                if maxR==None:
                    maxR=curR=nums[itrR]
                else:
                    curR+=nums[itrR]
                    maxR=max(maxR,curR)
            # if we couldn't grow window, then skip to next core since
            # we cannot form a valid trionic array
            if maxR==None:
                continue
            
            maxL = curL = None
            for itrL in range(l-1, -1, -1):
                if nums[itrL] >= nums[itrL+1]:
                    break
                if curL==None:
                    maxL=curL=nums[itrL]
                else:
                    curL+=nums[itrL]
                    maxL=max(maxL,curL)
            if maxL==None:
                continue
            
            res = max(res, curRes+maxL+maxR)
        
        return res
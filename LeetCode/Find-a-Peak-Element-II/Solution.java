class Solution:
    def findPeakGrid(self, mat: List[List[int]]) -> List[int]:
        m = len(mat)
        n = len(mat[0])
        
        def find_col_max(col):
            out = -1
            row = None
            for i in range(m):
                num = mat[i][col]
                if num > out:
                    out = num
                    row = i
            return row, out

        # Binary Search
        l, r = 0, n-1
        while l<r:
            mid = (l+r) // 2
            row, val = find_col_max(mid)
            right_val = mat[row][mid+1]
            if val<right_val:
                l = mid + 1
            else:
                r = mid

        return [find_col_max(l)[0], l]
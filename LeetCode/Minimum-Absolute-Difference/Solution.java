# @param {Integer[]} arr
# @return {Integer[][]}
def minimum_abs_difference(arr)
  # Sort the array in ascending order
  arr.sort!

  min_diff = Float::INFINITY
  # First pass: find the minimum absolute difference between adjacent elements
  (0...arr.length - 1).each do |i|
    diff = arr[i + 1] - arr[i]
    if diff < min_diff
      min_diff = diff
    end
  end

  result = []
  # Second pass: find all pairs with the minimum difference
  (0...arr.length - 1).each do |i|
    if arr[i + 1] - arr[i] == min_diff
      result << [arr[i], arr[i + 1]]
    end
  end

  result
end
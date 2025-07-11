class Solution(object):
    def deleteAndEarn(self, nums):
        max_num = max(nums)
        freq = [0] * (max_num + 1)

        for num in nums:
            freq[num] += num
        
        take, notTake = 0, 0
        for fr in freq:
            tmp = take
            take = notTake + fr
            notTake = max(tmp, notTake)
        
        return max(take, notTake)

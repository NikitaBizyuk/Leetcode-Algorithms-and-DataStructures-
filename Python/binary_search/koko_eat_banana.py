import math


# Leetcode (875)
# Koko Eating Bananas
# Medium
def minEatingSpeed(piles: list[int], h: int) -> int:
    bananasPerHour = maxValue(piles)
    left = 1
    right = bananasPerHour
    while left <= right:
        middle = (right + left)//2
        sumHours = 0
        for i in piles:
            sumHours += math.ceil(i/middle)
        if sumHours <= h:
            bananasPerHour = min(bananasPerHour,middle)
            right = middle - 1
        else:
            left = middle + 1
    return bananasPerHour



def maxValue(piles: list[int]) -> int:
    maxVal = 0
    for i in piles:
        maxVal = max(maxVal,i)
    return maxVal

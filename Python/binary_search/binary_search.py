
# leet code (704) - binary_search
# medium
def search(nums: list[int], target: int) -> int:
    left = 0
    right = len(nums) - 1
    middle = 0
    while left <= right:
        middle = (right + left)//2
        if target < middle:
            right = middle - 1
        elif target > middle:
            left = middle = 1
        else:
            return middle
    return -1

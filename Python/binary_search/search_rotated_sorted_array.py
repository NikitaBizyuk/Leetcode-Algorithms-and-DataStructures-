
# Leetcode(33) - Medium
# Search rotated sorted array
def search(nums: list[int],target: int) -> int:
    left = 0
    right = len(nums) - 1
    middle = 0
    while left <= right:
        middle = (left + right)//2
        if nums[middle] == target:
            return middle
        if nums[left] <= nums[middle]:
            if target >= nums[left] and target < nums[middle]:
                right = middle - 1
            else:
                left = middle + 1
        else:
            if target > nums[middle] and target <= nums[right]:
                left = middle + 1
            else:
                right = middle - 1

    return -1

def main():
    nums = [1,2,3,4,5,0]
    print(search(nums,2))
if __name__ == "__main__":
    main()
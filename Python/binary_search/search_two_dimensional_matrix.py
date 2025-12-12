
# LeetCode (74) Search a 2D matrix
# Medium
def searchMatrix(matrix: list[list[int]], target: int) -> bool:
    top_row = 0
    bottom_row = len(matrix) - 1
    middle_row = 0
    col_right = len(matrix[0]) - 1
    col_left = 0
    col_mid = 0
    while top_row <= bottom_row:
        middle_row = (bottom_row + top_row)//2
        if matrix[middle_row][0] <= target <= matrix[middle_row][col_right]:
            break
        elif target > matrix[middle_row][0]:
            top_row = middle_row + 1
        else :
            bottom_row = middle_row - 1
    if top_row > bottom_row:
        return False
    while col_left <= col_right:
        col_mid  = (col_right + col_left) // 2
        if target < matrix[middle_row][col_mid]:
            col_right = col_mid  - 1
        elif target > matrix[middle_row][col_mid]:
            col_left = col_mid + 1
        else:
            return True
    return False

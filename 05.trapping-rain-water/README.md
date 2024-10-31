# Rainwater Trapping Problem

## Problem Description

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, this problem requires calculating how much water it can trap after raining.

### Example

#### Example 1

**Input**: 
height = [0,1,0,2,1,0,1,3,2,1,2,1]

**Output**: 
6


### Constraints
- `n == height.length`
- `1 <= n <= 2 * 10^4`
- `0 <= height[i] <= 10^5`

## Solution Approach

The problem can be efficiently solved using two-pointer approach:
1. Use two pointers, one starting from the left end and another from the right.
2. Track the maximum heights encountered from both ends, storing these as `left_max` and `right_max`.
3. Move the pointer with the smaller height toward the center, calculating the water that can be trapped at each step by subtracting the current height from the maximum height on that side.

### Time Complexity
- **O(n)**, where `n` is the number of bars in the elevation map.

### Space Complexity
- **O(1)**, since only a constant amount of extra space is required.

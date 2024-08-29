# Remove Duplicates from Sorted Array

## Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

Consider the number of unique elements of `nums` to be `k`, and perform the following tasks:

1. Change the array `nums` such that the first `k` elements contain the unique elements in the order they were initially present in `nums`.
2. The remaining elements of `nums` are not important and can be ignored.
3. Return `k`.

### Custom Judge

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

### Example
**Input:**
```
nums = [1, 1, 2]
```
**Output:**
```
 2, nums = [1,2,_]
```
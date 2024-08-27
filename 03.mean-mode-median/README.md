# Mean, Median, and Mode Calculator

This program calculates the Mean, Median, and Mode for a given sorted array of integers. The output is formatted with precision up to two decimal places for both the Mean and Median, and the Mode is the first one encountered from the left in the case of multiple modes.

## Input Format

- The first line of input contains an integer `N` - the size of the array.
- The second line of input contains `N` integers - the elements of the array `A`.

## Output Format

- Print the Mean, Median, and Mode, separated by spaces.
- The Mean and Median are displayed with precision up to two decimal places.
- The Mode is the first one encountered from the left if there are multiple modes.

## Constraints

- `1 <= N <= 10^4`
- `0 <= A[i] <= 100`

## Example

### Input:
```
8
1 2 3 4 5 5 6 6
```

### Output:
```
4.00 4.50 5
```
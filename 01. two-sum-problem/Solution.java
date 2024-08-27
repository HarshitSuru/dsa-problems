class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }throw new IllegalArgumentException("No two sum solution");
    }
    void printArray(int[] nums){
        System.out.print("the indexes are:");
        for(int i=0;i<nums.length;i++)
        System.out.print(nums[i]+" ");
    }
    public static void main(String[] args) {
        int nums[]={2,3,4};
        int target=6;
        Solution sol=new Solution();
        sol.printArray(sol.twoSum(nums, target));

    }   
}
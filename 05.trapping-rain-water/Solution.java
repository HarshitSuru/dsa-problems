public class Solution {
        public int trap(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }
            int n = height.length;
            int Lmax[] = new int[n];
            int Rmax[] = new int[n];
            Lmax[0] = height[0];
            for (int i = 1; i < n; i++) {
                Lmax[i] = Math.max(height[i], Lmax[i - 1]);
            }
            Rmax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                Rmax[i] = Math.max(height[i], Rmax[i + 1]);
            }
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.min(Rmax[i], Lmax[i]) - height[i];
            }
            
            return sum;
        }
}

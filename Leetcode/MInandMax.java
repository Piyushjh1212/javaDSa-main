package Leetcode;
public class MInandMax {
    public int[] findMinAndMax(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        MInandMax sol = new MInandMax();
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5};

        int[] result = sol.findMinAndMax(nums);
        
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }
}

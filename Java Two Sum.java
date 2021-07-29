import java.util.Arrays;

class Solution {
    static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[] {0, 1};
        }
        int j = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
                }
            else if (i < nums.length-1 && (nums[i] + nums[i+1]) == target) {
                return new int[]{i, i+1};
            }
            j--;
        }
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums.length; l++) {
                if (k != l && (nums[k] + nums[l]) == target) {
                    return new int[]{k, l};
                }
            }
        }
    return new int[]{0};
    }
    public static void main(String[] args) {
        System.out.print(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
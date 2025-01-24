class Solution6 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(" i=" + i + " j=" + j);
                    return new int[] {i, j};
                }
            }
        }
   return new int[0];
    }
}
public class LTCode006{
    public static void main(String[] args) {
        Solution6 obj = new Solution6();
        
        int[] result = obj.twoSum(new int[] {1, 2, 3, 4, 5}, 5);
       
        System.out.println(" [" + result[0] + ", " + result[1] +"] ");
    }
}

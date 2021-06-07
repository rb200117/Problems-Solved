import java.util.Arrays;

public class LeetCode_P1 {
    public int[] twoSum(int[] nums, int target) {
        int[] tArray = new int[2];
      for(int i=0; i<nums.length; i++){
          for(int j=i+1; j<nums.length; j++){
              if(nums[i]+nums[j]==target){
                  tArray[0]=i;
                  tArray[1]=j;
              }
          }
      }
        return tArray;
    }

    public static void main(String[] args) {
        LeetCode_P1 obj = new LeetCode_P1();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{3,3}, 4)));
    }
}

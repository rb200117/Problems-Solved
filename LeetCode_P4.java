import java.util.*;

public class LeetCode_P4 {
    public int removeDuplicates(int[] nums) {
        int count;
        HashSet<Integer> hSet = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            hSet.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(hSet);
        Collections.sort(list);
        int[] arr = new int[list.size()];
         for(int i=0; i<arr.length; i++){
            nums[i]=list.get(i);
        }

         count = list.size();
        return count;
    }

    public static void main(String[] args) {
        LeetCode_P4 obj = new LeetCode_P4();
        System.out.println(obj.removeDuplicates(new int[]{-3,-1,0,0,0,3,3}));

    }
}

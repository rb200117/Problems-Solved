import java.util.ArrayList;
import java.util.List;

public class LeetCode_P7 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<List<Integer>> fList = new ArrayList<>();
        permuteHelper(list, new ArrayList<>(), nums);
        for(List<Integer> perm:list)
        {
            fList.add(perm);
        }
        return fList;
    }
    private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] nums){

        // Base case
        if(resultList.size() == nums.length){
            list.add(new ArrayList<>(resultList));
        }
        else{
            for(int i = 0; i < nums.length; i++){

                if(resultList.contains(nums[i]))
                {

                    continue;
                }

                resultList.add(nums[i]);

                permuteHelper(list, resultList, nums);
                // Unchoose element
                resultList.remove(resultList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        LeetCode_P7 obj = new LeetCode_P7();
     System.out.println(obj.permute(new int[]{10, 20, 30}));


    }
}

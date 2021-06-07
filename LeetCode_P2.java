import java.text.DecimalFormat;
import java.util.Arrays;

public class LeetCode_P2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double median;

      int[] merge = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
        Arrays.sort(merge);
        if(merge.length%2==0){
            int index2 = (merge.length/2);
            int index1 = index2-1;
            double n1 = merge[index1];
            double n2 = merge[index2];
            median = (n1+n2)/2;
        }
        else{
            int index =  (merge.length-1)/2;
            median = merge[index];
        }

      return median;
    }

    public static void main(String[] args) {
        LeetCode_P2 obj = new LeetCode_P2();
        System.out.println(obj.findMedianSortedArrays(new int[]{}, new int[]{3}));
        System.out.println(obj.findMedianSortedArrays(new int[]{1,8,6,2}, new int[]{5,4,8,3,7}));
    }
}

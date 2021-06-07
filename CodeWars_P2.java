import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class CodeWars_P2 {
    public static double findUniq(double[] arr) {
        //Accepted solution
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            if (j == arr.length)
                return arr[i];
        }

        return -1;
        //method-2
//        int count;
//        for(int i=0;i<arr.length;i++)
//        {
//            count=0;
//            for (int j = 0; j < arr.length; j++)
//            {
//                if(arr[i]==arr[j] && i!=j)
//                    count++;
//            }
//            if(count==0)
//                return arr[0]=arr[i];
//        }

//        // Do the magic
        //method-1
//        HashSet<Double> repSet = new HashSet<>();
//        HashSet<Double> uniqueSet = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j])
//                    repSet.add(arr[j]);
//            }
//            uniqueSet.add(arr[i]);
//        }
//        uniqueSet.removeAll(repSet);
//        Object obj = Collections.max(uniqueSet);
//        double[] answer = new double[1];
//        answer[0] = (double) obj;
//
//        return answer[0];
//        return arr[0];
    }
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
//        findUniq(new double[]{0, 1, 0});
//        findUniq(new double[]{1, 1, 1, 2, 1, 1});
    }
}

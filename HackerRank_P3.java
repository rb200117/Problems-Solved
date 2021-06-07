import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class HackerRank_P3 {
    public static String longest (String s1, String s2) {

        // your code
        String str = s1.concat(s2);
        int n = str.length();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<n; i++){
//            char ch = str.charAt(i);
//            set.add(ch);
//        }
        for(Character chr : str.toCharArray()){
            if(set.add(chr)){
                sb.append(chr);
            }
        }
      return String.valueOf(sb);
    }
    public static void main(String[] args) {
     System.out.println(longest("aasdsjssdddks", "asdasdbsadjasdkjas"));
    }
}

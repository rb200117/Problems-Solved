
import java.util.*;

public class HackerRank_P2 {
    static boolean isAnagram(String a, String b) {
        // Complete the function
       String str1 =  a.toLowerCase();
       String str2 = b.toLowerCase();
      int n1 = a.length();
      int n2 = b.length();
      char[] ch1 = str1.toCharArray();
      char[] ch2 = str2.toCharArray();

        if(n1!=n2){
          return false;
      }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
    }


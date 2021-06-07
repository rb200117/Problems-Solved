import java.util.ArrayList;
import java.util.StringTokenizer;

public class CodeWars_P1 {

    public static int findShort(String s) {
//        s=s.replaceAll("[^a-zA-Z0-9]"," ");
        StringTokenizer st = new StringTokenizer(s);
        ArrayList<String> strList = new ArrayList<>();
        while(st.hasMoreTokens()){
            int i=0;
            strList.add(i,st.nextToken() );
            ++i;
        }
        String longestName = "";
        for (String word : strList) {
            if (word.length() > longestName.length()) {
                longestName = word;
            }
        }

        String shortestName = longestName;
        for (String word : strList) {
            if (word.length() < shortestName.length()) {
                shortestName = word;
            }
        }
        int small = shortestName.length();
        return small;


    }


    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));
    }


}

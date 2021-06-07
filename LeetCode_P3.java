import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LeetCode_P3 {
    public int lengthOfLongestSubstring(String s) {
        int i;
        int n = s.length();
        int st = 0;
        int currlen = 0;
        int maxlen = 0;
        int start = 0;
        int length = 0;
        if(n!=0){
            HashMap<Character, Integer> pos = new HashMap<Character, Integer>();
            pos.put(s.charAt(0), 0);
            for (i = 1; i < n; i++)
            {
                if (!pos.containsKey(s.charAt(i)))
                {
                    pos.put(s.charAt(i), i);
                }
                else
                {
                    if (pos.get(s.charAt(i)) >= st)
                    {

                        currlen = i - st;
                        if (maxlen < currlen)
                        {
                            maxlen = currlen;
                            start = st;
                        }
                        st = pos.get(s.charAt(i)) + 1;
                    }
                    pos.replace(s.charAt(i), i);
                }
            }
            if (maxlen < i - st)
            {
                maxlen = i - st;
                start = st;
            }
            String str =  s.substring(start, start + maxlen);
            length = str.length();
        }

        return length;
    }

    public static void main(String[] args) {
        LeetCode_P3 obj = new LeetCode_P3();
        System.out.println(obj.lengthOfLongestSubstring(""));
    }
}

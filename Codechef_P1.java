import java.util.ArrayList;
import java.util.Scanner;

public class Codechef_P1 {

    public static void main (String[] args) throws java.lang.Exception
    {
        try{

            int a , b = 0;
            ArrayList<Integer> list = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            if(x<=1000 && x>=1){
                Integer[] n = new Integer[x];
                s.nextLine();
                for(int i=0; i<n.length; i++){
                    n[i] = s.nextInt();
                }
                for(Integer j: n){
                    String str = j.toString();
                    for(int k=0; k<str.length(); ++k){
                        char val = str.charAt(k);
                        a = Character.getNumericValue(val);
                        list.add(a);
//                        System.out.println(list);
                        b += list.get(k);

                    }
                    System.out.println(b);
                    b=0;
                    list.clear();
                }
            }

        } catch(Exception e){
            System.out.println(e);
        }
    }
}

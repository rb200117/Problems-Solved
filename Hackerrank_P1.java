import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hackerrank_P1 {
    public static void main(String args[] ) throws Exception {
        Set<Character> char_lower_set = new HashSet<>();
        Set<Character> char_upper_set = new HashSet<>();
        Scanner s = new Scanner(System.in);
        String[] string = new String[s.nextInt()];
        s.nextLine();
        for(int i=0; i<string.length; i++){
            string[i] = s.nextLine();
        }

        for(String str: string){
            for(int j=0; j<str.length(); ++j){
                char ch = str.charAt(j);
                 if(Character.isLowerCase(ch)){
                     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                         char_lower_set.add(ch);
                         System.out.println(char_lower_set);
                     }
                 } else{
                        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                            char_upper_set.add(ch);
                            System.out.println(char_upper_set);
                        }
                 }

            }
            if(char_lower_set.size()==5 && char_upper_set.size()==5){
                System.out.println("lovely string");
                //            }else if(char_upper_set.size()==5){
//                System.out.println("lovely string");
//                char_upper_set.clear();
            }else{
                System.out.println("ugly string");
            }
            char_lower_set.clear();
            char_upper_set.clear();
        }

    }
    }

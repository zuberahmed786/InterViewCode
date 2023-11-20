package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        String str = "handjdksadk";

        // Approach-1
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
           // for (int j = i + 1; j < str.length(); j++) {
               // if (str.charAt(i) != str.charAt(j)) {
                    set.add((str.charAt(i)));
                //}
           // }
        }

            for (Character c : set) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }


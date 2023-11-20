package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public class CountOccEachCh {

    public static void main(String[] args) {

        String st ="zuuuberahmed";
        CountOccEachCh.countEachChaInStr(st);

        try {
            char[] ch = st.toCharArray();
            Map<Character,Integer> map = new LinkedHashMap<>();

            for (char c : ch){
                if (!map.containsKey(c)){
                    map.put(c,1);
                }else {
                    int value = map.get(c);
                    map.put(c,value+1);
                }
            }
            System.out.println("WithOut Method "+map);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public static void countEachChaInStr(String str){
        char[] cha = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();

        for (char ch : cha){
            //char chars = str.charAt(ch);

            if (!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int value = map.get(ch);
                map.put(ch,value+1);
            }
        }

        System.out.println(map);
    }
}

package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStr {
    public static void main(String[] args) {

        String str = "aham";
        LongestSubStr.findLongSubStr(str);

    }
    public static void findLongSubStr(String str){

        Map<Character,Integer> map = new LinkedHashMap<>();
        int longestLength =0;
        String longestSubStr=null;
        char[] arr = str.toCharArray();

        for (int i=0;i<arr.length;i++){

            char c = arr[i];

            if (!map.containsKey(c)){
                map.put(c,i);
            }else {
                i=map.get(c);
                map.clear();
            }
            if (map.size()>longestLength){
                longestLength=map.size();
                longestSubStr=map.keySet().toString();
            }
        }

        System.out.println("Length "+longestLength);
        System.out.println("SubString "+longestSubStr);
    }
}

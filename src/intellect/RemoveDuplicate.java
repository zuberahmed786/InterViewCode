package intellect;

import java.util.*;

public class RemoveDuplicate {

    public static void main(String[] args) {
      int[] arr = {2,4,9,2,20,4,5};
      RemoveDuplicate.remove(arr);
      String str ="abcabdd";
      RemoveDuplicate.removeFromStr(str);
    }

    public static void remove(int[] arr){

       // System.out.println("list "+list);
        HashSet<Integer> s  = new HashSet();

        for (int i=0;i<arr.length;i++){

            s.add(arr[i]);
        }
        System.out.println("remove "+s);
        int[] removeDup = new int[s.size()];
        int index=0;
        for (int element : s){
            removeDup[index++]=element;
           // System.out.println("dup "+removeDup[index]);

        }

        Arrays.sort(removeDup);

        System.out.println(" "+Arrays.toString(removeDup));
    }

    public static void removeFromStr(String str){
        StringBuilder result = new StringBuilder();
        HashSet seen = new HashSet();

        for (int i=0;i<str.length();i++){
            char current = str.charAt(i);

            if (!seen.contains(current)){
                seen.add(current);
                result.append(current);
            }
        }
        System.out.println("remove Duplicate "+result.toString());
        System.out.println("Seen "+seen);
    }
}

package string;

import java.util.Arrays;

public class SortStr {

    public static void main(String[] args) {
        String str3 = "khan";
        SortStr.reveStr(str3);

        String str ="zuber";
        char[] arr = str.toCharArray();
        char temp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));

        char[] character = str.toCharArray();
        Arrays.sort(character);
       // System.out.println(character);
        StringBuilder str2 = new StringBuilder();
//        for (int i:character){
//            str2.charAt(i);
//        }
    }

    public static void reveStr(String str){
        char[] ch = str.toCharArray();
        char temp;
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if (ch[i]>ch[j]){
                    temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }

        }
        System.out.println(new String(ch));
    }
}

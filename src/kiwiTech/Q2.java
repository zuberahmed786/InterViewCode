package kiwiTech;

public class Q2 {

    public static void main(String[] args) {
        String str ="abacdab";
        Q2.countChar(str);
    }

    public static void countChar(String str){
        int[] charCount = new int[256];
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        for (int i=0;i<charCount.length;i++){
            if (charCount[i]>0){
                System.out.println(" char " +(char) i+  " times "+charCount[i]);
            }
        }
    }
}

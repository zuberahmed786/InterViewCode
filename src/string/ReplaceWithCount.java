package string;

public class ReplaceWithCount {
    public static void main(String[] args) {
        String input ="ahmadkhna";
        char toReplace ='a';
        ReplaceWithCount.replaceWithCount(input,toReplace);
        if (input.indexOf(toReplace)==-1){
            System.out.println("Character not present in string");
            System.exit(0);
        }
        int count=1;
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if (ch==toReplace){
                input = input.replaceFirst(String.valueOf(toReplace),String.valueOf(count));
                count++;
            }
        }
        System.out.println(input);
    }

    public static void replaceWithCount(String str,char toReplace){
        if (str.indexOf(toReplace)==-1){
            System.out.println("char is not present in string");
            System.exit(0);

            }else {
            int count=1;
            for (int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if (ch==toReplace){
                    str = str.replaceFirst(String.valueOf(toReplace),String.valueOf(count));
                    count++;
                }
            }
            System.out.println("method calling "+str);
        }
        }
    }

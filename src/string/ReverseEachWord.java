package string;

public class ReverseEachWord {
    public static void main(String[] args) {
        String name ="zuber ahmed";
        ReverseEachWord.reverseWord(name);

        String[] words = name.split(" ");
        //System.out.println(words);
        String output="";
        for (String word : words){
            //System.out.print("inside "+word);
            String rev ="";
            for (int ch=word.length()-1;ch>=0;ch--){
                rev = rev+word.charAt(ch);
            }
            output = output+rev+" ";
        }
        System.out.println("without method "+output);
    }

    public static void reverseWord(String str){
        String[] words = str.split(" ");
        String  output ="";

        for (String word : words){
            String reverseWord="";
            for (int ch=word.length()-1;ch>=0;ch--){
               reverseWord = reverseWord + word.charAt(ch);
            }
            output = output + reverseWord+" ";
        }


        System.out.println(output);
    }
}

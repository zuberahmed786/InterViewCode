package string;

public class FirstNonRepeated {

    public static void main(String[] args) {
        String str="zzbeer";
        FirstNonRepeated.firstNonRe(str);
        for (int i=0;i<str.length();i++){

            boolean unique=true;
            for (int j=0;j<str.length();j++){
                //char ch= str.charAt(j);
                if (i!=j && str.charAt(i)==str.charAt(j)){
                    unique= false;
                }
            }
            if (unique){
                System.out.println(str.charAt(i));
                break;
            }
        }

    }

    public static void firstNonRe(String str){
        for (int i=0;i<str.length();i++){

            boolean unique = true;
            for (int j=0;j<str.length();j++){
                if (i!=j && str.charAt(i)==str.charAt(j)){
                    unique=false;
                }
            }
            if (unique){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}

package intellect;

public class PrintDup {
    public static void main(String[] args) {
       int[] arr={3,2,8,4,9,2,4};
       PrintDup.printArr(arr);
        System.out.println("/n");
       String str ="abscac";
       PrintDup.printStr(str);
    }

    public static void printArr(int[] arr){

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.print(" " +arr[i]);
                }
            }
        }

    }

    public static void printStr(String str){
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            for (int j=i+1;j<str.length();j++){
                if (ch==str.charAt(j)){
                    System.out.print(" "+ch);
                }
            }
        }
    }
}

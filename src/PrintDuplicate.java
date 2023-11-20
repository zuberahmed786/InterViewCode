public class PrintDuplicate {

    public static void main(String[] args) {
        String str="acjdssjjxcab";

        char[] count = new char[256];

        for (char ch: str.toCharArray()){
            count[ch]++;
        }
  for (int i=0;i<count.length;i++){
      if (count[i]>1){
          System.out.println((char)i+"   repeated char is ");
      }
  }}
}

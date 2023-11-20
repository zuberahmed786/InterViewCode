package Interview;

public class Q1 {

    public static void main(String[] args) {
             String str="aba";
             Q1.checkPalin(str);
             int[] arr ={2,4,8,4,9};
             int index= Q1.binarySearch(arr,3,0,arr.length-1);
             if (index!=-1){
                 System.out.println("found at index "+index);
             }
             else {
                 System.out.println("not found "+index);
             }

    }

    public static void checkPalin(String str){

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse =reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }

    public static int binarySearch(int[] arr,int search,int left,int right){
             if (left<=right){
                 int mid=left+(right-left)/2;
                 if (arr[mid]==search){
                     return mid;
                 }
                 else if(arr[mid]<search){
                     return binarySearch(arr,search,mid+1,right);
                 }
                 else {
                     return binarySearch(arr,search,left,mid-1);
                 }
             }
             return -1;

    }
}

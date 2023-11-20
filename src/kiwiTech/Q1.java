package kiwiTech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {
        int[] arr ={2,8,1,0,7,0,5};
        Q1.sort(arr);
    }

    public static void sort(int[] arr){
        //Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
       // System.out.println(arr);
        int indexCou=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                arr[indexCou]=arr[i];
                indexCou++;
            }
        }

        while (indexCou<arr.length){
            arr[indexCou]=0;
            indexCou++;
        }

        for (int a : arr){
            System.out.print(" "+a);
        }
    }
}

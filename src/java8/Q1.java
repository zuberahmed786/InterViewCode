package java8;

import java.util.Optional;

public class Q1 {
    public static void main(String[] args) {
        Runnable runnable = ()->System.out.println("Lamda Expression");
        System.out.println(runnable);
        String no="Not Null";
        Optional<String> optional = Optional.ofNullable(no);
        String result = optional.orElse("Null Value passed");
        System.out.println(result);

        String str ="Zuber";
        String str1= new String("Zuber");
        str1.intern();

        System.out.println(str==str1);

        StringBuffer stringBuffer =new StringBuffer("Zuber");
        stringBuffer=new StringBuffer("hello");

    }
}

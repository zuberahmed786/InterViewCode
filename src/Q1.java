import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Q1 {

    public static void main(String[] args) {
        String st2 = new String("Navin");
        String st1 = "Navin";
        String st3 = "Navin";
        st2.intern();

        System.out.println(st1==st2);

        System.out.println(st1.equals(st3));

        Parent p = new Child();
        p.setMethod();










                }


}

class Parent{
   public static void setMethod(){
        System.out.println("parent");
    }
}

class Child extends Parent{
   public static void setMethod(){
        System.out.println("child");
    }
}

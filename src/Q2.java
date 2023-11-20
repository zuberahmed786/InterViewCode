public class Q2 {

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[56]=20/0;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array");
        }
        catch (ArithmeticException e1)
        {
            System.out.println("Arith");
        }

    }
}

public class arith_exp_handling {
    public static void main (String args[]) {
        try {
            int b,a=5;
            b = a/0;

            System.out.println(b);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
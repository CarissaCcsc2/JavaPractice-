public class promote {
    public static void main(String[] args) {
        //Demonstrates how each value in the expression gets promoted to match the second argument to each binary operator
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        //Looking at f * b, b is promoted to a float. Looking at i/c, c is promoted to an integer. Looking at d*s, s is promoted to a double
        double result  = (f*b) + (i/c) -  (d*s);
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s));
        System.out.println("result = " + result);


    }
}

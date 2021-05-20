public class variableLifetime {
    public static void main(String[] args) {
        //Demonstrate the lifetime of a variable
        int x;

        for(x = 0; x < 3; x++){

            int y = -1; //y is initialized each time block is entered 
            System.out.println("y is; " + y); //this always prints -1;
            y = 100;
            System.out.println("y is now: " + y);

        }
    }
}

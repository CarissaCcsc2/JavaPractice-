public class example5 {
    public static void main(String[] args) {
        /* From page 41, practice with 'Long'
        #Compute the distane light travels using
        long variables.
        */

        int lightspeed;
        long days;
        long seconds;
        long distance;

        //approximate speed of light in miles per second
        lightspeed = 186000;
        //specify number of days
        days = 1000;
        //convert to seconds
        seconds = days * 24 * 60 * 60;
        //compute distance
        distance = lightspeed * seconds;

        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}

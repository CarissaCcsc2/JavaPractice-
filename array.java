public class array {
    public static void main(String[] args) {
        //Demonstrate a one-dimensional array
        int month_days[];
        //can also do: int month_days[] = new int[12];
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;

        System.out.println("April has "  + month_days[3] + " days.");

        //or:

        int months_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("April has "  + months_days[3] + " days.");

    }
}

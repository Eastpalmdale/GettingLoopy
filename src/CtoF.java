import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        String userMetricVsImperial = "c";
        double userTemp = 0;
        double userTempC = 0;
        double userTempF = 0;
        boolean done = false;
        String trash;
        // loop
        do {
            System.out.println("Please enter your temperature.");
            if (in.hasNextDouble()) {
                userTemp = in.nextDouble();
            } else {
                trash = in.nextLine();
                System.out.println("Please enter numbers only");
            }
            System.out.println("What unit do you want it in? enter c or f for celsius or fahrenheit.");
            if (in.hasNextDouble()) {
                trash = in.nextLine();
                System.out.println("Please enter c or f only.");
            }
            else {
                userMetricVsImperial = in.nextLine() ;
                done = true;
            }
        } while (!done);
        userMetricVsImperial = userMetricVsImperial.toLowerCase();
        switch (userMetricVsImperial) {
            case "f":
                userTempF = userTemp;
                userTempF = (userTempC - 32) * 5 / 9;
                System.out.println("Your temp in fahrenheit is  "+userTempF);
            case "c":
                userTempC = userTemp;
                userTempC = (userTempF * 5 / 9) + 32;
                System.out.println("Your temp in celsius is  "+userTempC);
            default:
                trash = in.nextLine();
                System.out.println("Please enter c or f only.");
        }
    }
}

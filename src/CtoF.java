import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //variables
        String userMetricVsImperial = "";
        double userTemp = 0;
        double userTempC = 0;
        double userTempF = 0;
        boolean done = false;
        String trash;
        // loop
        do {
            System.out.println("What unit do you want it in? enter c or f for celsius or fahrenheit.");
            if (in.hasNextDouble()) {
                trash = in.nextLine();
                System.out.println("please enter c or f only");
            }
            else {
                userMetricVsImperial = in.nextLine() ;
                done = true;
            }
            System.out.println("Enter your temperature in the other unit that you don't want it converted to.");
            if (in.hasNextDouble()) {
                userTemp = in.nextDouble();
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println("please enter numbers only");
            }
        } while (!done);
        userMetricVsImperial = userMetricVsImperial.toLowerCase();
        switch (userMetricVsImperial) {
            case "f":
                userTempF = (userTemp - 32) * 5 / 9;
                System.out.println("Your temp in fahrenheit is  "+userTempF);
                break;
            case "c":
                userTempC = (userTemp * 5 / 9) + 32;
                System.out.println("Your temp in celsius is  "+userTempC);
                break;
            default:
                trash = in.nextLine();
                System.out.println("Please enter c or f only.");
        }
    }
}

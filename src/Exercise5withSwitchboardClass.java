import java.util.Scanner;

public class Exercise5withSwitchboardClass {
    public static void main(String[] args) {
        int numCalls;
        System.out.println("How many calls do you need to store in this switchboard?: ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        numCalls = inputValue.nextInt();
        Switchboard mySwitchboard = new Switchboard(numCalls);

        //PRINT ALL
        mySwitchboard.printAll();

        /*PRINT 1 SPECIFIC CALL
        int callNumber=0;
        System.out.println("Which call do you want to print it's cost?");
        inputValue = new Scanner(System.in);
        callNumber = inputValue.nextInt();
        mySwitchboard.printCall(mySwitchboard.getMyCalls(), callNumber ); */

        //PRINT TOTAL TURNOVER
        double turnOver=0;
        turnOver=mySwitchboard.totalTurnover();
        System.out.println(turnOver+" cents total.");


        System.out.println("Total turnover of this calls is: "+turnOver/100+" €.");
    }
    }




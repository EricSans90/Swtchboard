import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int callNumber=0;
        System.out.println("How many calls do you want to store?");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        callNumber = inputValue.nextInt();
        Call[] myCalls= new Call[callNumber];

        //Getting the calls
        for (int i = 0; (i < callNumber); i++) {
            System.out.println("Introduce in order the source number, destination number, duration in seconds, the " +
                    "band of the call, and L for local and P for provincial:");
            int aux1=0, aux2=0, aux3=0, aux4=0;
            char localLetter;
            boolean isLocal=true;
            inputValue = new Scanner(System.in);
            aux1 = inputValue.nextInt();
            inputValue = new Scanner(System.in);
            aux2 = inputValue.nextInt();
            inputValue = new Scanner(System.in);
            aux3 = inputValue.nextInt();
            inputValue = new Scanner(System.in);
            aux4 = inputValue.nextInt();
            inputValue = new Scanner(System.in);
            localLetter = inputValue.next().charAt(0);
            if (Character.toUpperCase(localLetter)=='L'){
                isLocal=true;
            } else if (Character.toUpperCase(localLetter)=='P') {
                isLocal=false;
            } else {
                System.out.println("Error, you haven't introduced letter L o P");
                break;
            }

            myCalls[i]= new Call(aux1,aux2,aux3,aux4, isLocal);
            //System.out.println(myCalls[i]);
            //System.out.println(myCalls[i].toString());
            //System.out.println(myCalls[i].callCost());
        }

        //printing the calls
        double turnOver=0;
        for (int i = 0; (i < callNumber); i++) {
            System.out.print(myCalls[i].toString());
            System.out.println(" And that call costs: "+myCalls[i].callCost()/100+" €.");
            turnOver += myCalls[i].callCost();
        }
        System.out.println("Total turnover is:"+turnOver/100+" €.");
        }

    }

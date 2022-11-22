import java.util.Scanner;

public class Switchboard {
    private int numberCalls=0;
    private Call [] myCalls;

    public Switchboard (int numberCalls){
        this.numberCalls=numberCalls;
        this.myCalls =new Call[numberCalls];
        for (int i=0; i<numberCalls; i++){
            System.out.println("Introduce for call number: "+(i+1)+", in order, the source number, destination number, " +
                    "duration in seconds, the band of the call, and L for local and P for provincial:");
            int aux1=0, aux2=0, aux3=0, aux4=0;
            char localLetter;
            boolean isLocal=true;
            Scanner inputValue;
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
            this.myCalls[i]= new Call(aux1,aux2,aux3,aux4, isLocal);

        }
        }

        public void printAll(){
            for (int i=0; i<numberCalls; i++){
                System.out.println("Call number "+(i+1)+" data is: ");
                System.out.println(this.myCalls[i]);
            }
        }

        public void printCall(Call[] myCalls, int numberOfCall){
            System.out.println("Call number "+(numberOfCall)+" data is: ");
            System.out.println(this.myCalls[numberOfCall-1]);
        }
        public Call[] getMyCalls() {
            return myCalls;
        }
        public int getNumberCalls() {
            return numberCalls;
        }

        public double totalTurnover (){
            double total=0;
            for (int i=0; i<this.numberCalls; i++){
                total += this.myCalls[i].callCost();
            }
            return total;
        }

    }


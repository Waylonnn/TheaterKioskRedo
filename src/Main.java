import java.util.Scanner;

public class Main {
    /*As people pass through an entry kiosk at the theater, they are prompted to enter their age.  If they are 21 or
    older, they get a paper wristband.

    Code a logic program that asks the user to enter their age. If they are 21 or over, the program displays a
    message that they get a wristband.

    The program does nothing if they are not 21 or over.

    Test Runs:
    Over 21, 21, and under 21
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age;
        System.out.print("How old are you?: ");
        if(scan.hasNextInt()){
            age = scan.nextInt();
            if(age >= 21){
                System.out.println("You get a wristband!");
            }
        } else System.out.print("Error: Invalid Input");


    }
}
import java.util.Scanner;
public class guessNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int randomNum = (int)(Math.random()*100)+1;
        int attempt = 0;

        System.out.println("This Game is about guessing a number 1-100.");
        System.out.print("Enter your guess: ");

        int num1= scan.nextInt();
        attempt++;

        while(num1 != randomNum){
            if(num1>randomNum){
                System.out.println("Try lower number.");
            }else{ 
                System.out.println("Try higher number.");
            }

            System.out.print("Enter your guess: ");
            num1= scan.nextInt();
            attempt++;
        }
        System.out.println("You guess the correct number "+randomNum+" in "+attempt+" attempts.");


    }
    
}

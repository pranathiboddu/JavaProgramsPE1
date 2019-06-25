import java.util.Scanner;

public class Guessingnumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a guess: ");
        int guess=sc.nextInt(); // teking input from user to enter a guess
        guessNumber(guess);
    }

    public static void guessNumber(int guess){
            int secretNumber;
            secretNumber = (int) (Math.random() * 49 + 1);//generating random secret number
            Scanner sc = new Scanner(System.in);
            System.out.println("Your guess is " + guess);
            //performing conditions to find secret number
            while (true) {
                if (guess == secretNumber) {

                    System.out.println("Your guess is correct");
                    break;
                } else if (guess < secretNumber) {

                    System.out.println("Your guess is smaller than the secret number.");
                    guess = sc.nextInt();
                } else if (guess > secretNumber) {

                    System.out.println("Your guess is greater than the secret number.");
                    guess = sc.nextInt();
                }
            }
        }
    }




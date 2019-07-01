import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt(); // taking input from user
        iteration(number);


    }
    public static void iteration(int number)
    {
        for(int i=1;i<=number;i++) // performing iteration starting from 1
        {
            for(int j=1;j<=i;j++) // repetition
            {
                System.out.print(i);
            }

        }
    }

}

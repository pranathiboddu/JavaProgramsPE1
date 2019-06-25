import java.util.Scanner;

public class Loop {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt(); // taking input from user
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

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        long number=scanner.nextLong(); // intializing long and reading number
        palindrome(number);

}
public static void palindrome(long number)
{
    long temp,reverse=0,remainder,count=0,remainder1;
    temp=number;// story copy of number into temporary variable
    while(number!=0) //logic for palindrome
    {
        remainder=number%10;
        reverse=reverse*10+remainder;
        number=number/10;
    }
    if(reverse==temp)
    {
        while (temp!= 0)
        {
            remainder1 = temp % 10; //finding sum of even number in palindrome
            if (remainder1 % 2 == 0)
            {
                count = count + remainder1;
            }
            temp = temp / 10;
        }
        if (count > 25)
        {
            System.out.println("The number is palindrome and greater than 25");

        }
        else
            {
            System.out.println("The number is palindrome and less than 25");
        }
    }
    else{

        if(count > 25)
        {
            System.out.println("The number is not palindrome and greater than 25");
        }
        else
            {
            System.out.println("The number is not palindrome and less than 25");
        }
        }
}

}



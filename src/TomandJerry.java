import java.util.Scanner;

public class TomandJerry {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt(); //intializing and reading the number
        condition(number);

    }
    public static void condition(int number)
    {

        if(number%2!=0 && (number>20 && number<30))// performing odd logic
        {
            System.out.println("Tom");
        }
        if(number%2==0 && (number>20 && number<30))//performing even logic
        {
            System.out.println("Jerry");
        }
    }
}

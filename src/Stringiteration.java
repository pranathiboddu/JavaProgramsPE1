import java.util.Scanner;

public class Stringiteration {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine(); // getting string from user
        int number=sc.nextInt(); // geting number (how many last characters to be iterated)
        System.out.print(word);
        stringiteration(word,number);

    }
    public static void stringiteration(String word,int number)
    {
        int count=0;
        while(count!=number)
        {
            for(int i=word.length()-number;i<word.length();i++) //getting last number of characters to iterate
            {
                char c=word.charAt(i);
                System.out.print(c);
            }
            count++;
        }
    }
}

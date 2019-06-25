import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: "); // intialized a string
        String word = sc.nextLine();
        character(word);

    }
    public static void character(String word)
    {
    char[] ch = word.toCharArray(); // converts string into character array
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
            // checking the character is vowel or not
            {
                System.out.println("Entered character " + ch[i] + " is  Vowel");
            }
            else if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) // checking the character for consonant
            {
                System.out.println("Entered character " + ch[i] + " is Consonant");
            }
            else
                System.out.println("Error-Not an alphabet");
        }
    }
}


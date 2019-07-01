import java.util.Scanner;

public class DefineCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0); //getting character for ascii value
        character(ch);
    }


    public static void character(char ch){
            if (ch >= 65 && ch <= 96) {

                System.out.println("uppercase");
            }
            else if (ch >= 97 && ch <= 122)
            {
                System.out.println("lowercase");
            }
            else if (ch >= 48 && ch <= 57) {
                System.out.println("digit");
            }
            else {
                System.out.println("special symbol");
            }

        }

}
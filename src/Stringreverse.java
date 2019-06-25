import java.util.Scanner;

public class Stringreverse {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String originalString = sc.nextLine();
            reverse(originalString);
        }
        public static void reverse(String originalString)
        {
            String temp = "";

            int length = originalString.length();

            for (int i = length - 1; i >= 0; i--)
            {
                temp = temp + originalString .charAt(i);
            }

            System.out.println("String after reversing: " + temp);
        }
}



import java.util.Scanner;

public class StringReverse {

        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            String originalString = scanner.nextLine();
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



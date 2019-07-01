import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // taking input how many elements should be there in array
        System.out.println("elements are:");
        arraysum(number);

    }


    public static void arraysum(int number) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int array[] = new int[number]; //initializing array
        try {
            for (int i = 0; i < number; i++)  // reading array
            {

                array[i] = scanner.nextInt();
            }
            for (int i = 0; i < number; i++) {

                if (array[i] == (Integer.valueOf(array[i])))// checking integer value or not
                {
                    count = count + array[i];
                }
            }
            System.out.println(count);

        }
        catch (Exception e) // catching exception
        {
            System.out.println("Error , not an integer value");
        }

    }
}

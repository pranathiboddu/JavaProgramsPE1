import java.util.Scanner;

public class Arraysum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); // taking input how many elements should be there in array
        System.out.println("elements are:");
        arraysum(number);

    }


    public static void arraysum(int number) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int array[] = new int[number]; //initializing array
        for (int i = 0; i < number; i++)  // reading array
        {

            array[i] = sc.nextInt();
        }

            for (int i = 0; i < number; i++) {

                if (array[i] == (int) array[i]) // checking integer value or not
                {
                    count = count + array[i];
                }
                else
                    {

                        System.out.println("error");
                }

            }
            System.out.println(count);

        }

    }

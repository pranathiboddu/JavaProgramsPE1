import java.util.*;
import java.util.stream.Collectors;

public class DigitSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        sortingarray(input);
}
public static void sortingarray(int input){
        int evensum = 0;
        int length = Integer.toString(input).length();
        int[] arr = new int[length];
        //spliting and placing each number into array
        for (int i = 0; i < length; i++) {
            arr[i] = input % 10;
            //finding even or odd(if even adding array and storing in evensum)
            if (arr[i] % 2 == 0) {
                evensum = evensum + arr[i];
            }
            input = input / 10;
        }
        //array sorting by default method
        Arrays.sort(arr);

        int number = 0;
        for (int i = 0; i < length; i++) {
            //reversing the array
            number = (number * 10) + arr[length - i - 1];
        }

        System.out.println(" Sorted in descending order : " + number);
        System.out.println("Sum of even numbers :" + evensum);
        boolean var = (evensum > 15) ? true : false;
        System.out.println("Sum of even digits is more than 15 : " + var);
    }
}






























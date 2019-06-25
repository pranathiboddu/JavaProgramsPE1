import java.util.*;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sortingarray(input);
}
public static void sortingarray(int input){
        int evensum = 0;
        int len = Integer.toString(input).length();
        int[] arr = new int[len];
        //spliting and placing each number into array
        for (int i = 0; i < len; i++) {
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
        for (int i = 0; i < len; i++) {
            //reversing the array
            number = (number * 10) + arr[len - i - 1];
        }

        System.out.println(" Sorted in descending order : " + number);
        System.out.println("Sum of even numbers :" + evensum);
        boolean var = (evensum > 15) ? true : false;
        System.out.println("Sum of even digits is more than 15 : " + var);
    }
}






























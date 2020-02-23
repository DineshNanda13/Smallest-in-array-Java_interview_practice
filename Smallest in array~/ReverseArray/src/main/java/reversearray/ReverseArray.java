package reversearray;

/**
 *
 * @author Dinesh Nanda
 */
import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int array_size = s.nextInt();

        int arr[];

        arr = new int[array_size];

        System.out.println("Enter the elements of an array: ");

        for (int i = 0; i < array_size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Your entered array is: ");
        for (int i = 0; i < array_size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int new_array[];
        new_array = new int[array_size];
        
        for (int i = 0; i < array_size; i++) {
            new_array[(array_size -1 ) - i] = arr[i];
        }
        System.out.print("Reversed array is: ");
        for (int i = 0; i < array_size; i++) {
            System.out.print(new_array[i]+" ");
        }
    }
}

# Smallest-in-array-Java_interview_practice
Java program to find smallest number in array
package smallest_in_array;

import java.util.Scanner;

/**
 *
 * @author Dinesh Nanda
 */

public class Smallest_In_Array {

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
        
        int smallest = arr[0];

        for (int i = 0; i < array_size - 1; i++) {
            
            if(smallest > arr[i+1]){
                smallest = arr[i+1];
            }
        }
        System.out.println("Smallest number in array is: "+smallest);
    }
}

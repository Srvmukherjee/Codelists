/*

Problem Statement: Given an array, we have to find the smallest element in the array.

Examples:

Example 1:
Input: arr[] = {2,5,1,3,0};
Output: 0
Explanation: 0 is the smallest element in the array. 

Example2: 
Input: arr[] = {8,10,5,7,9};
Output: 5
Explanation: 5 is the smallest element in the array.

*/
import java.util.*;

public class C_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        
        // Declaration and initialization of array
        int[] a = new int[5];
        
        // Input loop
        for(int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        // Call the method to find the smallest element
        int smallest = findSmallest(a);
        
        // Output the result
        System.out.println("The smallest element in the array is: " + smallest);
    }
    
    // Method to find the smallest element in the array
    static int findSmallest(int a[]) {
        Arrays.sort(a);
        return a[0];
    }
}



package Basic;

import java.util.Scanner;

public class printArray {

    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};

        // for(int num: arr){
        // System.out.print(num+" ");
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements Prints: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}

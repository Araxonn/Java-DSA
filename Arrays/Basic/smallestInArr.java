package Basic;

import java.util.Scanner;

public class smallestInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i : arr) {
            if(i<min) min=i;
        }
        System.out.println("Largest in Array : "+min);

    }
}

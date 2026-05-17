package Basic;

import java.util.Scanner;

public class largestInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i : arr) {
            if(i>max) max=i;
        }
        System.out.println("Largest in Array : "+max);

    }
}

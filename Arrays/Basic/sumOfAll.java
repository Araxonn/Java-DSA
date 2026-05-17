package Basic;
import java.util.Scanner;

public class sumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum= sum+arr[i];
        }
        System.out.println("Sum : "+sum);


    }
}

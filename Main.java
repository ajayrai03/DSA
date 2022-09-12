import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter your input:");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        System.out.println("array is :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        scn.close();
    }
}

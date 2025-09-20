import java.util.Scanner;

public class BTH_Tuan4_Bai7 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Nhap cac phan tu:");
        for (int i = 1; i <= n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        System.out.println("Tong cac phan tu trong mang = " + sum);

        sc.close();
    }
}

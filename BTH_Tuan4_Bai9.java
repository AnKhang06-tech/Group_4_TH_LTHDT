import java.util.Scanner;

public class BTH_Tuan4_Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua danh sach: ");
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.println("Nhap cac phan tu cua danh sach:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Cac phan tu trong danh sach:");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i]);
        }
        sc.close();
    }
}

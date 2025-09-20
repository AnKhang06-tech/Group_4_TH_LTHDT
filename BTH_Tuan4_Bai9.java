import java.util.ArrayList;
import java.util.Scanner;

public class BTH_Tuan4_Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo danh sách rỗng
        ArrayList<Integer> danhSach = new ArrayList<>();

        System.out.print("Nhập số lượng phần tử trong danh sách: ");
        int n = sc.nextInt();

        // Nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int x = sc.nextInt();
            danhSach.add(x);
        }

        // In danh sách
        System.out.println("\nCác phần tử trong danh sách là:");
        for (int so : danhSach) {
            System.out.print(so + " ");
        }

        sc.close();
    }
}

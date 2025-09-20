import java.util.Scanner;

public class BTH_Tuan4_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = sc.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int b = sc.nextInt();

        System.out.print("Nhập số thứ ba: ");
        int c = sc.nextInt();

        int min = a;  // giả sử ban đầu a là nhỏ nhất
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        System.out.println("Số nhỏ nhất trong ba số là: " + min);
        sc.close();
    }
}

import java.util.Scanner;

public class BTH_Tuan4__Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double a = sc.nextDouble();
        System.out.print("Nhap so thu hai: ");
        double b = sc.nextDouble();

        System.out.println("Chon phep tinh:");
        System.out.println("1. Cong");
        System.out.println("2. Tru");
        System.out.println("3. Nhan");
        System.out.println("4. Chia");

        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Ket qua: " + (a + b));
        } else if (choice == 2) {
            System.out.println("Ket qua: " + (a - b));
        } else if (choice == 3) {
            System.out.println("Ket qua: " + (a * b));
        } else if (choice == 4) {
            if (b != 0) {
                System.out.println("Ket qua: " + (a / b));
            } else {
                System.out.println("Khong the chia cho 0");
            }
        } else {
            System.out.println("Lua chon khong hop le");
        }

        sc.close();
    }
}

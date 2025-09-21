import java.util.Scanner;

public class BTH_Tuan4__Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu ban dau: ");
        int n = sc.nextInt();
        int[] arr = new int[100]; // cap phat du phong toi da 100 phan tu

        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // in mang ban dau
        System.out.print("Mang ban dau: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // them phan tu
        System.out.print("Nhap vi tri muon them: ");
        int posAdd = sc.nextInt();
        System.out.print("Nhap gia tri muon them: ");
        int valueAdd = sc.nextInt();

        if (posAdd >= 0 && posAdd <= n) {
            for (int i = n; i > posAdd; i--) {
                arr[i] = arr[i - 1];
            }
            arr[posAdd] = valueAdd;
            n++;
        } else {
            System.out.println("Vi tri khong hop le");
        }

        System.out.print("Mang sau khi them: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // xoa phan tu
        System.out.print("Nhap vi tri muon xoa: ");
        int posDel = sc.nextInt();

        if (posDel >= 0 && posDel < n) {
            for (int i = posDel; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        } else {
            System.out.println("Vi tri khong hop le");
        }

        System.out.print("Mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

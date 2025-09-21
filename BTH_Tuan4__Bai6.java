import java.util.Scanner;

public class BTH_Tuan4__Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen thu nhat: ");
        int x = sc.nextInt();
        System.out.print("Nhap so nguyen thu hai: ");
        int y = sc.nextInt();

        int a = x;
        int b = y;

        // tim UCLN bang vong lap while
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int ucln = a;
        int bcnn;

        if (x == 0 || y == 0) {
            bcnn = 0; // truong hop dac biet
        } else {
            bcnn = (x * y) / ucln;
        }

        System.out.println("UCLN: " + ucln);
        System.out.println("BCNN: " + bcnn);

        sc.close();
    }
}

import java.util.Scanner;
public class BTH_Tuan4_Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxCount = 0;               
        int mostFrequent = arr[0];      
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = arr[i];
            }
        }
        System.out.println("Phan tu xuat hien nhieu nhat la: " + mostFrequent);
        System.out.println("Xuat hien " + maxCount + " lan");
        sc.close();
    }
}

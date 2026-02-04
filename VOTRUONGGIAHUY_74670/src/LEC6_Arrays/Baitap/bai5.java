package LEC6_Arrays.Baitap;

import java.util.*;

public class bai5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Fix: Naming convention
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập giá trị phần tử " + i + ": ");
            mang[i] = scanner.nextInt();
        }
        System.out.println("Mảng đã nhập là: " + Arrays.toString(mang));
        mangDaoNguoc(mang);
        System.out.println("Mảng đảo ngược là: " + Arrays.toString(mang));
        sochan(mang);
        int tong = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 3 == 0 && mang[i] % 5 == 0) {
                tong += mang[i];
            }
        }
        System.out.println("Tổng các số chia hết cho 3 và 5 là: " + tong);

        sapXepTangDan(mang);

        sapXepGiamDan(mang);
    }

    public static void mangDaoNguoc(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int huy = arr[l];
            arr[l] = arr[r];
            arr[r] = huy;
            l++;
            r--;
        }
    }

    public static void sochan(int[] mang) {
        System.out.print("mang cac so chan la:");
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                System.out.print(mang[i] + " ");

            }
        }
        System.out.println();

    }

    public static void sapXepTangDan(int[] mang) {
        Arrays.sort(mang);
        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(mang));
    }

    public static void sapXepGiamDan(int[] mang) {
        Integer[] huy = Arrays.stream(mang)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(huy, Collections.reverseOrder());

        System.out.println("Mảng sau khi sắp xếp giảm dần: " + Arrays.toString(huy));
    }

}

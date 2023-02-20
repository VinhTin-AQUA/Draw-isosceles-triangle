package main.enump;

import java.util.Scanner;

public class EnumP {

    public static void triangle(int[] a) {
        int n = a.length;
        int i = 0;
        int m = 0;
        while (i < n) {
            m = n - 1 - i;
            if (m != 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("  ");
                }
            }

            for (int j = 0; j < n - m; j++) {
                System.out.print(a[j] + " ");
            }

            for (int j = n - m - 2; j >= 0; j--) {
                System.out.print(a[j] + " ");

            }

            System.out.println();
            i++;
        }

    }

    public static void main(String[] args) {
        // nhập chiều cao
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu cao: ");
        int n = sc.nextInt();

        // khởi tạo mảng có giá trị phần tử từ 1 đến n
        int[] a = new int[n];
        for (int i = 1; i <= n; i++) {
            a[i - 1] = i;
        }

        triangle(a);
    }
}

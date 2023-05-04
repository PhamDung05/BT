package Method1;

import java.util.Scanner;

public class Methon {
    public static void main(String[] args) {
        int a = nhap();
        int b = nhap();
        System.out.println("tong = " + tinh_tong(a, b));
        System.out.println("hieu = " + tinh_hieu(a, b));
        System.out.println("tich = " + tinh_tich(a, b));
        System.out.println("thuong = " + tinh_thuong(a, b));
    }
    public static int nhap () {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("nhap so: ");
        n = input.nextInt();
        return n;
    }
    public static int tinh_tong (int n, int m) {
        int tong = n + m;
        return tong;
    }
    public static int tinh_hieu (int a, int b) {
        int hieu = a - b;
        return hieu;
    }
    public static int tinh_tich (int a, int b) {
        int tich = a * b;
        return tich;
    }
    public static double tinh_thuong (int a, int b) {
        double thuong = (double) a / b;
        return thuong;
    }
}

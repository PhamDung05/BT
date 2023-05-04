package baidau;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b;
        int tong;
        int hieu;
        double thuong;
        int tich;
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b =");
        b = input.nextInt();
        tong = a + b;
        hieu = a - b;
        thuong = (double) a / b;
        tich = a * b;
        System.out.println("tong a + b =" + tong);
        System.out.println("hieu a - b =" + hieu);
        System.out.println("thuong a / b =" + thuong);
        System.out.println("nhan a * b =" + tich);
        boolean true_false = true;
        true_false = false;
    }
}

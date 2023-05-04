package HCN;

import HCN.HCN;

import java.util.Scanner;

public class HCN1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int cd, cr;
        HCN cn1 = new HCN();
        System.out.println("nhap cac canh cua HCN.HCN: ");
        System.out.print("chieu rong: ");
        cn1.chieurong = input.nextInt();
        System.out.print("chieu dai: ");
        cn1.chieudai = input.nextInt();
        System.out.println("nhap cac canh HCN2: ");
        System.out.print("chieu dai = ");
        cd = input.nextInt();
        System.out.print("chieu rong = ");
        cr = input.nextInt();

        HCN hcn2 = new HCN (cd,cr);

        System.out.println("hinh chu nhat 1:");
        cn1.tinhS();
        cn1.tinhC();

        System.out.println("hinh chu nhat 2:");
        hcn2.tinhS();
        hcn2.tinhC();
    }
}

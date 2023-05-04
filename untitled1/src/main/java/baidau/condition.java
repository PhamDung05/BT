package baidau;

import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if (a > 0) {
            if (a %2==0) {
                System.out.print(a + "la so duong chan");
            }else{
                System.out.print(a + "la so duong le");
            }
        }else if (a < 0) {
            System.out.print(a + "la so am");
        }else{
            System.out.print(a + "la so khong am khong duong");
        }
    }
}


package songuyen;

import java.util.Scanner;

public class tongnguyrn2 {
    public static void main(String[] args) {
        int tong = 0;
        int [] mang = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i ++){
            System.out.print("mang[" + i + "] = ");
            mang[i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++){
            tong += mang[i];
        }
        System.out.println("tong = " + tong);
    }
}

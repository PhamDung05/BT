package songuyen;

import java.util.Scanner;

public class tongnguyen {
    public static void main(String[] args) {
        int n, sodu, tong = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("s = ");
        n = input.nextInt();
        while (n > 0) {
            sodu = n % 10;
            n = n / 10;
            tong += sodu;
        }
        System.out.println("tong cac so = " + tong);
    }
}

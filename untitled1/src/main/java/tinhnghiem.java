import java.util.Scanner;

import static java.lang.Math.sqrt;

public class tinhnghiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, dt;
        System.out.print("a =");
        a = input.nextDouble();
        System.out.print("b =");
        b = input.nextDouble();
        System.out.print("c =");
        c = input.nextDouble();
        dt = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("phuong trinh vo so nghiem");
                } else {
                    System.out.print("phuong trinh vo nghiem");
                }
            } else {
                double x;
                x = -c / b;
                System.out.print("phuong trinh bac 1 co nghiem");
                System.out.print("x =" + x);
            }
        } else {

            if (dt > 0) {
                double x1, x2;
                x1 = (-b + sqrt(dt)) / (2 * a);
                x2 = (-b - sqrt(dt)) / (2 * a);
                System.out.println("phuong trinh co 2 nghiem phan biet");
                System.out.println("x1 =" + x1);
                System.out.println("x2 =" + x2);

            } else if (dt == 0) {
                double x;
                x = -b / (2 * a);
                System.out.print("phuong trinh co 1 nghiem duy nhat");
                System.out.print("x =" + x);
            } else {
                System.out.print("phuong trinh vo nghiem");
            }
        }
    }
}

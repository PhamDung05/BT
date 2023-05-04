package Method1;

import java.util.Scanner;

public class methodtamgiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        System.out.print("a = ");
        a = input.nextDouble();
        double b;
        System.out.print("b = ");
        b = input.nextDouble();
        double c;
        System.out.print("c = ");
        c = input.nextDouble();
        methodtamgiac.tamgiac(a, b, c);
    }
    public static void tamgiac(double a, double b, double c) {
        if (a + b > c || a + c > b || b + c > a){
            System.out.print("la 1 tam giac");
        }else {
            System.out.print("khong phai 1 tam giac");
        }
    }
}

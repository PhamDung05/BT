package Method1;

import java.util.Scanner;

public class methodptbac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("a = ");
        a = input.nextInt();
        int b;
        System.out.print("b = ");
        b = input.nextInt();
        int c;
        System.out.print("c = ");
        c = input.nextInt();
        methodptbac2.ptbac2(a, b, c);
    }
    public static void ptbac2 (int a, int b, int c){
        int x1, x2;
        int delta = b*b - 4*a*c;
        if (a == 0) {
            if (b == 0) {
                System.out.println("pt vo so nghiem");
            }else {
                System.out.println("pt co 1 nghiem duy nhat: " + "x = " + (-c/b));
            }
            return;
        }
        if (delta > 0){
            x1 = (int) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (int) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("pt co 2 nghiem: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0){
            x1 =(-b / (2*a));
            System.out.println("pt co nghiem kep = " + " x1 = x2 = " + x1);
        }
        else {
            System.out.println("pt vo nghiem");
        }
    }
}

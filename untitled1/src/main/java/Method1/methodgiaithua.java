package Method1;

import java.util.Scanner;

public class methodgiaithua {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        System.out.print("giai thua cua " + n + "la " + giaithua(n));
    }
    public static int giaithua(int i){
        int f = 1;
        if (i < 0){
            return -1;
        }else if ((i == 0) || (i == 1) ){
            return 1;
        }else {
            for (int a = 2; a <= i; a ++) {
                f = f * a;
            }
        }
        return f;
    }
}

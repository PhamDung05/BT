package songuyen;

import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        int n;
        System.out.print("n = ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if(n > 0){
            if ( kiemtrasonguyento (n) == 1)
                System.out.println(n + " la so nguyen to ");
            else
                System.out.println(n + " khong phai la so nguyen to ");
        }
    }
    public static int kiemtrasonguyento (int n) {
        int i;
        int d = 0;
        for(i = 1; i <= n; i++){
            if(n % i == 0)
                d ++;
        }
        if (d == 2)
            return 1;
        else return 0;
    }
}

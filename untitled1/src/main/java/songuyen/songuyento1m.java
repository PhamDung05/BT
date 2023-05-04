package songuyen;

import java.util.Scanner;

public class songuyento1m {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int i= 0;
        String primeNumbers = "";
        System.out.print("n = ");
        int n = input.nextInt();
        for (i = 1; i <= n; i ++){
            int counter = 0;
            for (num = i; num >= 1; num --) {
                if (i % num == 0){
                }
                counter = counter + 1;
                }
            if (counter == 2){
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("cac so nguyen to tu 1 den" + n + "la");
        System.out.println(primeNumbers);
    }
}

package baidau;

import java.util.Scanner;

public class lonnho {
    public static void main(String[] args) {
        int n [] = new int [10];
        Scanner input = new Scanner(System.in);
        int nhonhat = n [0];
        int lonnhat = n [0];
        for (int i = 0; i < n.length; i++) {
            System.out.print("mang [" + i + "] = ");
            n [i] = input.nextInt();
            if (n [i] < nhonhat){
                nhonhat = n [i];
            }
            if (n [i] > lonnhat) {
                lonnhat = n [i];
            }
        }
        System.out.println("Gia tri lon nhat: " + lonnhat);
        System.out.println("Gia tri nho nhat: " + nhonhat);
    }
}

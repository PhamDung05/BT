package ngaythang;

import java.util.Scanner;

public class ngaythang {
    public static void main(String[] args) {
        int thang;
        Scanner input = new Scanner(System.in);
        System.out.print("n =");
        thang  = input.nextInt();
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10|| thang == 12){
            System.out.print("thang " + thang + " co 31 ngay");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11 ){
            System.out.print("thang" + thang + "co 30 ngay");
        } else if (thang == 2){
            int nam;
            System.out.print("nhap nam: ");
            nam = input.nextInt();
            if(nam % 4  == 0){
                System.out.println("thang" + thang + "co 29 ngay");
            } else {
                System.out.println("thang" + thang + "co 28 ngay");
            }
        }else {
            System.out.println("nhap sai thang");
        }
    }
}

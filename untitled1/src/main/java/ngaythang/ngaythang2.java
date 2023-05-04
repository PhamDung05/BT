package ngaythang;

import java.util.Scanner;

public class ngaythang2 {
    public static void main(String[] args) {
        int thang;
        Scanner input = new Scanner(System.in);
        System.out.print("thang =");
        thang  = input.nextInt();
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("thang" + thang + "co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("thang" + thang + "co 30 ngay");
                break;
            case 2:
                int nam;
                System.out.print("nam =");
                nam = input.nextInt();
                if(nam % 4 == 0){
                    System.out.print("thang" + thang + "co 29 ngay");
                }else {
                    System.out.print("thang" + thang + "co 28 ngay");
                }
                break;
            default:
                System.out.println("nhap sai thang");
        }
    }
}

package gioithieu;

import java.util.ArrayList;
import java.util.Scanner;

public class gioithieustudent {
    private ArrayList<Student> ds;
    public gioithieustudent() {
        ds = new ArrayList<Student>(10);
    }
    public String masinhvien, email;
        public void nhap() {
            Scanner input = new Scanner(System.in);
            System.out.println("Ma sinh vien: ");
            masinhvien = input.nextLine();
            System.out.println("Email: ");
            email = String.valueOf(input.nextDouble());
        }

        public void hocbong(){
            double diemTB = ds.get(0).getMath();
        if (diemTB >= 8.0 && diemTB <= 10) {
                System.out.println("Duoc nhan hoc bong");
            }
            if (diemTB < 8.0) {
                System.out.println("Khong duoc nhan hoc bong");
            }
        }
    }

package gioithieu;

import java.util.Scanner;

public class Student extends Person {
    private double math, physics, chemistry, average;
    public Student() {

    }
    public Student(String name, int birthday, double math, double physics, double chemistry) {
        this.name = name;
        this.birthday = birthday;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        average = (math + physics + chemistry) / 3;
    }
    public double getAverage() {
        return average;
    }
    public double getMath() {
        return math;
    }
    public void display() {
        super.display();
        System.out.println("\tDiem toan: " + math);
        System.out.println("\tDiem vat ly: " + physics);
        System.out.println("\tDiem hoa hoc: " + chemistry);
        System.out.println("\tDiem trung binh: " + average);
    }
    public void nhap() {
        super.nhap();
        Scanner input = new Scanner(System.in);
        System.out.print("\tNhap diem toan: ");
        math = input.nextDouble();
        System.out.print("\tNhap diem ly: ");
        physics = input.nextDouble();
        System.out.print("\tNhap diem hoa: ");
        chemistry = input.nextDouble();
        average = (math + physics + chemistry) / 3;
    }
}

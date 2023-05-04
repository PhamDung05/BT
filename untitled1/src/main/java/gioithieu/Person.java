package gioithieu;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int sex;
    protected int birthday;
    protected String address;
    public Person (){
    }
    public Person (int sex, String name, int birthday, String address){
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
    }
    public String getName (){
        return name;
    }
    public void setName (){
        this.name = name;
    }
    public int getSex (){
        return sex;
    }
    public void setSex (){
        this.sex = sex;
    }
    public int getBirthday (){
        return birthday;
    }
    public void setBirthday (){
        this.birthday = birthday;
    }
    public String getAddress (){
        return address;
    }
    public void setAddress (){
        this.address = address;
    }
    public void display (){
        System.out.println("Ho ten: " + name);
        System.out.println("gioi tinh: " + sex);
        System.out.println("ngay sinh: " + birthday);
        System.out.println("dia chi: " + address);
    }
    public void nhap (){
        Scanner input = new Scanner(System.in);
        System.out.print("\tnhap Ho Ten: ");
        input.nextLine();
        name = input.nextLine();
        System.out.print("\tnhap gioi tinh: ");
        sex = input.nextInt();
        System.out.print("\tnhap ngay sinh: ");
        birthday = input.nextInt();
        System.out.print("\tnhap dia chi: ");
        input.nextLine();
        address = input.nextLine();
    }
}

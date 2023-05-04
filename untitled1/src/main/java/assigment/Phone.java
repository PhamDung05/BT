package assigment;

import java.util.Scanner;

public class Phone {
    public String IMEI;
    public String Name;
    public String Manufacturer;
    public int Price;
    public String Release_date;
    public String RAM;
    public String ROM;
    public String Chip;
    public double Screen_size;
    public String phone_size;
    public Phone (){
        super ();
    }
    public Phone (String IMEI, String Name, String Manufacturer, int Price, String Release_date, String RAM, String ROM, String Chip, Double Screen_size, String phone_size){
        super();
        this.IMEI = IMEI;
        this.Name = Name;
        this.Manufacturer = Manufacturer;
        this.Price = Price;
        this.Release_date = Release_date;
        this.RAM = RAM;
        this.ROM = ROM;
        this.Chip = Chip;
        this.Screen_size = Screen_size;
        this.phone_size = phone_size;
    }
    public void nhap (){
        Scanner input = new Scanner(System.in);
        System.out.print("IMEI: ");
        IMEI = input.nextLine();
        System.out.print("Name: ");
        Name = input.nextLine();
        System.out.print("Manufacturer: ");
        Manufacturer = input.nextLine();
        System.out.print("Price: ");
        Price = input.nextInt();
        System.out.print("Release date: ");
        Release_date = input.nextLine();
        System.out.print("RAM: ");
        RAM = input.nextLine();
        System.out.print("ROM: ");
        ROM = input.nextLine();
        System.out.print("Chip: ");
        Chip = input.nextLine();
        System.out.print("Screen size: ");
        Screen_size = input.nextDouble();
        System.out.print("Phone size: ");
        phone_size = input.nextLine();
    }
    @Override
    public String toString() {
        return "Phone{" +
                "IMEI='" + IMEI + '\'' +
                ", Name='" + Name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Price=" + Price +
                ", Release_date='" + Release_date + '\'' +
                ", RAM='" + RAM + '\'' +
                ", ROM='" + ROM + '\'' +
                ", Chip='" + Chip + '\'' +
                ", Screen_size=" + Screen_size +
                ", phone_size='" + phone_size + '\'' +
                '}';
    }
}

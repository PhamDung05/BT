package HCN;

import java.util.Scanner;

public class HCN {
    public int chieudai;
    public int chieurong;
    public void tinhC () {
        int C;
        C = (chieudai + chieurong) * 2;
        System.out.println("chu vi HCN.HCN = " + C);
    }
    public void tinhS () {
        int S;
        S = chieudai * chieurong;
        System.out.println("Dien tich HCN.HCN = " + S);
    }

    @Override
    public String toString() {
        return "HCN.HCN{" +
                "chieudai=" + chieudai +
                ", chieurong=" + chieurong +
                '}';
    }
    public HCN (int chieudai, int chieurong){
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }
    public HCN () {
    }
}

package tangdan;

public class tangdan {
    public static void main(String[] args) {
        int i = 1;
        for(int s = 1;s < 1000000; s += 2) {
            i += s;
            System.out.println("so le tu 1 den 10000" + i);
        }
    }
}
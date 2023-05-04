import java.util.Scanner;

public class tongle2 {
    public static void main(String[] args) {
        int i;
        int n;
        int s = 0;
        System.out.print("n =");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (i = 1; i < n; i++) {
            if (i % 2 != 0) {
                s += i;
            }
            System.out.println("tong so le tu 1 den n =" + s);
        }
    }
}
import java.util.Scanner;

public class tinhn {
    public static void main(String[] args) {
        int n;
        int f = 1;
        int i;
        System.out.print("n =");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n > 0){
            for (i = 1; i <= n; i++) {
                f = f * i;
            }
            System.out.print("giai thua cua " + n + " la " + f);
        }else {
            System.out.print("n khong co giai thua");
        }
    }
}

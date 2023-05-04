import java.util.Scanner;

public class vehinh2 {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

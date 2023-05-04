package tangdan;

import java.util.Scanner;

public class tunhodenlon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sapxep = arr[0];
        for (int i = 0; i < 10; i++){
            System.out.print("mang[" + i +"] = ");
            arr [i] = input.nextInt();
        }
        for (int i = 0; i < 10; i++){
            for (int j = i + 1; j < 10; j++){
                if (arr [i] > arr [j]){
                    sapxep = arr [i];
                    arr [i] = arr [j];
                    arr [j] = sapxep;
                }
            }
        }
        for (int i = 0; i < 10; i++){
            System.out.print(arr [i]+"  ");
        }
    }
}

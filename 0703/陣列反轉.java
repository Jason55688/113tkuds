import java.util.Scanner;

public class 陣列反轉 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取陣列長度 n
        int n = sc.nextInt();
        int[] array = new int[n];

        // 讀取陣列元素
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // 反轉陣列並輸出
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? " " : ""));
        }

        sc.close();
    }
}
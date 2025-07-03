import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取 N 和 M
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 初始化陣列和列總和
        int[][] array = new int[N][M];
        int[] columnSums = new int[M];

        // 讀取陣列元素並計算每一列的總和
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = sc.nextInt();
                columnSums[j] += array[i][j];
            }
        }

        // 輸出每一列的總和
        for (int j = 0; j < M; j++) {
            System.out.print(columnSums[j] + (j < M - 1 ? " " : ""));
        }

        sc.close();
    }
}
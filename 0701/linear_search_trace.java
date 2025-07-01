import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        // 宣告並初始化整數陣列
        int[] s = {1, 3, 5, 7, 9};

        // 創建 Scanner 物件來讀取使用者輸入
        Scanner scanner = new Scanner(System.in);

        // 提示使用者輸入要搜尋的數字
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();  // 讀取使用者輸入的目標數字

        // 呼叫線性搜尋方法並輸出結果
        if (linearSearch(s, target)) {
            System.out.println("結果：找到");
        } else {
            System.out.println("結果：找不到");
        }

        // 關閉 Scanner 物件
        scanner.close();
    }

    // 線性搜尋方法，返回是否找到目標數字
    public static boolean linearSearch(int[] arr, int target) {
        // 遍歷陣列每一個元素
        for (int i = 0; i < arr.length; i++) {
            // 顯示每次比對的過程
            System.out.println("比對中：" + target + " vs " + arr[i]);

            // 檢查是否找到目標數字
            if (arr[i] == target) {
                return true;  // 找到目標數字
            }
        }
        return false;  // 沒有找到目標數字
    }
}

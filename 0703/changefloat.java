import java.util.Scanner;

public class changefloat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個浮點數: ");
        float number = scanner.nextFloat();
        System.out.printf("格式化輸出: %.2f%n", number);
        scanner.close();
    }
}

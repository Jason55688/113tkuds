import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個字符(英文字母大寫): ");
        char character = scanner.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("ASCII value of '" + character + "' is: " + asciiValue);
        scanner.close();
    }
}

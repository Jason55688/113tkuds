import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取年份 Y
        System.out.print("請輸入年份: ");
        int Y = sc.nextInt();

        // 判斷是否為閏年
        if ((Y % 4 == 0 && Y % 100 != 0) || (Y % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
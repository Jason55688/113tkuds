
public class digitSum {
    // 計算正整數各位數字總和
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Sum of digits of " + n + " is " + digitSum(n));
    }
}

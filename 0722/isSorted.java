
public class isSorted {
    // 檢查陣列是否已按升序排列
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 2, 1};
        System.out.println("arr1 is sorted: " + isSorted(arr1));
        System.out.println("arr2 is sorted: " + isSorted(arr2));
    }
}

public class ReverseArray {
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int j = 0;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 6, 4 };
        int[] ans = reverseArray(arr);
        printArray(ans);
    }
}
public class RepeatingFirst {
    static int firstRepeat(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 2, 6 };
        System.out.println(firstRepeat(arr));
    }
}

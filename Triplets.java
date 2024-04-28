public class Triplets {
    static int tripletSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 3 };
        int target = 12;
        int output = tripletSum(arr, target);
        System.out.println(output);
    }
}
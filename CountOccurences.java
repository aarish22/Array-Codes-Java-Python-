public class CountOccurences {
    public static int countNumber(int arr[], int x) {
        int count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int my_list[] = { 5, 6, 5, 1, 5 };
        int target = 5;
        int output = countNumber(my_list, target);
        System.out.println(output);
    }
}

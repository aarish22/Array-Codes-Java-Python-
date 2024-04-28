public class lastOccurence {
    int idx;

    public int searchIdx(int arr[], int x) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == x) {
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        lastOccurence l = new lastOccurence();
        int my_list[] = { 5, 6, 5, 3, 5, 4 };
        int target = 5;
        int output = l.searchIdx(my_list, target);
        System.out.println(output);
    }
}

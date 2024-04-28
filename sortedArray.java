public class sortedArray {

    public void isSorted(int arr[]) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order.");
        } else if (isDescending) {
            System.out.println("The array is sorted in descending order.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    public static void main(String[] args) {
        int myList[] = { 1, 7, 98 };
        sortedArray s = new sortedArray();
        s.isSorted(myList);
    }
}

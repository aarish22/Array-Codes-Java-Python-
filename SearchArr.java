import java.util.Scanner;

class Search {
    public int Search(int arr[], int x) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}

class SearchArr {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 5, 7 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int target = sc.nextInt();
        Search s = new Search();
        int result = s.Search(arr, target);
        if (result == -1) {
            System.out.println("Number not found in array");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
}
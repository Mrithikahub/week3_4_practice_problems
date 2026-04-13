public class RiskBinary {

    static int binarySearch(int arr[], int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { 10, 25, 50, 100 };

        System.out.println(binarySearch(arr, 50));
    }
}
// package _16_Sorting;

public class _5_Quic {

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; i++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        pivot = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIdx = partition(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 4, 5, 3, 1, 2, 5, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

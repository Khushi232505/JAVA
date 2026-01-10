import java.util.Arrays;

public class quicksort {

    
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            
            int partitionIndex = partition(arr, low, high);

            
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }

    
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

       
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Given array is");
        System.out.println(Arrays.toString(arr));

        quicksort ob = new quicksort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        System.out.println(Arrays.toString(arr));
    }
}

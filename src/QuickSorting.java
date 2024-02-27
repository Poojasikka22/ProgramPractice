import org.jetbrains.annotations.NotNull;

public class QuickSorting {
    public static void main(String args[]) {
        try {
        int arr[] = {54, 7, 0, 12, 43, 21};
        QuickSorting q = new QuickSorting();
        q.sort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        catch(Exception e){
            System.out.println( "Exception");
        }

    }

    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = divide(arr, low, high);
            sort(arr, 0, pi - 1);
            sort(arr, pi + 1, high);
            //divide(arr, 0, arr.length);
        }
    }

    public int divide(int arr[], int low, int high) {
        int pivot = arr[high];
        int j = low - 1;
            for (int i = low; i < high; i++) {
                if (arr[i] < pivot) {
                    j++;

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            int temp = arr[j + 1];
            arr[j + 1] = arr[high];
            arr[high] = temp;

            return j + 1;
        }
}


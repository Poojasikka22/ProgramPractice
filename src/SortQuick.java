public class SortQuick {
    public static void main(String args[]) {
        int arr[] = {8, 7, 2, 9, 4, 1};
        SortQuick qs = new SortQuick();
        qs.sort(arr, 0, arr.length-1 );
        for(int i =0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = divide(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);

        }
    }

    public int divide(int arr[], int low, int high) {
        int pivot = arr[high];
        int prev = low - 1;
        if (low < high) {
            for (int next = low; next < high; next++) {
                int temp = 0;
                if (arr[next] < pivot) {
                    prev++;

                    temp = arr[prev];
                    arr[prev] = arr[next];
                    arr[next] = temp;
                }
            }
               int temp = arr[prev + 1];
                arr[prev + 1] = arr[high];
            arr[high] = temp;

        }
            return prev+1;

        }


}

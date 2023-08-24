package sorting;

public class SBI {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            displayArray(arr);
        }
        displayArray(arr);
    }

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            displayArray(arr);
        }
//        displayArray(arr);
    }

    public static void insertionSort(int arr[]){

    }

    public static void displayArray(int arr[]){
        System.out.print("\nCurrent Array :");

        for (int a :
                arr) {
            System.out.print(a + " ");
        }
    }


}

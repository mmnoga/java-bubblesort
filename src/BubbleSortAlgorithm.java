public class BubbleSortAlgorithm {
    private static int[] randomArray(int length, int maxNumber) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            double number = Math.random() * (maxNumber + 1);
            array[i] = (int) number;
        }

        return array;
    }

    private static void print(int[] array) {

        if (array == null) {
            System.out.println("Array is empty!");
            return;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static int[] bubbleSort(int[] array) {

        int arrayLength = array.length;

        if (arrayLength == 0) {
            return null;
        }

        do {
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }

            arrayLength--;
        }
        while (arrayLength > 1);

        return array;
    }

    public static void main(String[] args) {

        int[] unsortedArray = randomArray(20, 100);

        print(unsortedArray);

        int[] sortedArray = bubbleSort(unsortedArray);

        print(sortedArray);
    }

}


// 2,7,3,4,9,6 - Вивід
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 2, 9, 6};
        selectionSortEvenDesc(arr);
        printArray(arr);
    }

    public static void selectionSortEvenDesc(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value % 2 != 0) {
                count++;
            }
            else if(value % 3 != 0) {
                count++;
            }
        }

        int[] evenIndexes = new int[count];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 != 0) {
                evenIndexes[idx++] = i;
            }
        }

        for (int i = 0; i < count - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < count; j++) {
                if (array[evenIndexes[j]] < array[evenIndexes[maxIdx]]) {
                    maxIdx = j;
                }
            }
            swap(array, evenIndexes[i], evenIndexes[maxIdx]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printArray(int[] array) {
        for (int el : array) {
            System.out.print(el + " ");
        }
    }

}
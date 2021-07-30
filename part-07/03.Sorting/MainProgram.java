public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 5, 99, 3, 13};
        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(MainProgram.smallest(numbers));
        System.out.println(MainProgram.indexOfSmallest(numbers));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        MainProgram.swap(numbers, 1, 5);
        System.out.println(indexOfSmallest(numbers));
        MainProgram.sort(numbers2);

    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;

        for (int small : array) {
            if (small < smallest) {
                smallest = small;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == MainProgram.smallest(array)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // Create temporary array from index, to get smallest number in range
        int size = table.length - startIndex;
        if (size <= 0) {
            return -2;
        }
        int[] array = new int[size];
        int start = 0;
        for (int i = startIndex; i < table.length; ++i) {
            array[start] = table[i];
            ++start;
        }

        for (int i = startIndex; i < table.length; ++i) {
            if (table[i] == MainProgram.smallest(array)) {
                return i;
            }
        }
        return -1;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            // Print array
            System.out.print("[");
            for (int j = 0; j < array.length; ++j) {
                System.out.print(array[j]);
                if (j < array.length - 1) {
                    System.out.print(", ");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println("");

            // Sort
            MainProgram.swap(array, MainProgram.indexOfSmallestFrom(array, i), i);
        }

    }

}

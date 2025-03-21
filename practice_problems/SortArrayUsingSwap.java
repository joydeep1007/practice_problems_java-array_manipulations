public class SortArrayUsingSwap {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
            
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nSorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

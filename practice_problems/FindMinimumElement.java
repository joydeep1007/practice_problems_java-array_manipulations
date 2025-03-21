public class FindMinimumElement {
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MAX_VALUE; 
        }
        
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; 
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int min = findMin(array);
        if (min == Integer.MAX_VALUE) {
            System.out.println("\nInvalid array");
        } else {
            System.out.println("\nMinimum element in the array: " + min);
        }
    }
}

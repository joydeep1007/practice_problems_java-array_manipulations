public class SwapArrayElements {
    public static void swapFirstAndLast(int[] array) {
        if (array.length < 2) return;
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        swapFirstAndLast(array);
        
        System.out.println("\nArray after swapping first and last elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

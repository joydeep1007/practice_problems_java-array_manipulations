public class SwapMiddleWithSecondLast {
    public static void swapMiddleWithSecondLast(int[] array) {
        if (array.length < 2) return;
        
        int middleIndex = array.length / 2;
        int secondLastIndex = array.length - 2;
        
        if (array[middleIndex] < -3) {
            int temp = array[middleIndex];
            array[middleIndex] = array[secondLastIndex];
            array[secondLastIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, -4, -7, 4, 5}; 
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        swapMiddleWithSecondLast(array);
        
        System.out.println("\nArray after swapping middle with second last element if middle is less than -3: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

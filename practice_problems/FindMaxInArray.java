public class FindMaxInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        
        System.out.println("Array created: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("\nMaximum element in the array: " + max);
    }
}

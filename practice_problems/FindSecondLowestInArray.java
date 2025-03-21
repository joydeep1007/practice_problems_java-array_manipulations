public class FindSecondLowestInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        
        System.out.println("Array created: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int min = array[0];
        int secondMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
        }
        
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("\nNo second lowest element exists.");
        } else {
            System.out.println("\nSecond lowest element in the array: " + secondMin);
        }
    }
}

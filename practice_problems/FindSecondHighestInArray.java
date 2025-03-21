public class FindSecondHighestInArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 12, 3};
        
        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i] != highest) {
                secondHighest = array[i];
            }
        }
        
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("\nNo second highest element exists.");
        } else {
            System.out.println("\nSecond highest element in the array: " + secondHighest);
        }
    }
}

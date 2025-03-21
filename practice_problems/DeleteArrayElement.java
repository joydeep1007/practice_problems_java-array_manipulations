public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int elementToDelete = 40;
        int size = array.length;
        
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        
        int deleteIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToDelete) {
                deleteIndex = i;
                break;
            }
        }
        
        
        if (deleteIndex != -1) {
            for (int i = deleteIndex; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            
            System.out.println("\nArray after deleting element " + elementToDelete + ":");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("\nElement not found in array");
        }
    }
}

public class InsertArrayElement {
    public static void main(String[] args) {
        int[] array = new int[6];  
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        int size = 5;  
        
        int elementToInsert = 25;
        int position = 2;  
        
        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        for (int i = size - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }
        
        
        array[position] = elementToInsert;
        size++;
        
        System.out.println("\nArray after inserting " + elementToInsert + " at position " + position + ":");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

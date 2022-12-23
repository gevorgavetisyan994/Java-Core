package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {9, 6, 7, 16, 18, 39, -8, 45, 20, 55};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Max " + max);
        System.out.println();
        int min = array[0];
        for (int i = 0; i > array.length; i--) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Min "+ min);
    }
}

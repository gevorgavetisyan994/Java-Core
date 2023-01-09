package homework5;

public class ArraySort {
    public static void main(String[] args) {
        //Պետք է գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        // Այիսինքն մեր լոգիկան աշխատելուց հետո որ մասիվի բոլոր էլեմենտները տպենք,
        // պետք է դասավորած աճման կարգով տպի բոլոր էլեմենտները։
        // Սա ստացվելուց հետո մի հատ էլ նվազման կարգով դասավորեք։
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        for (int i = 0; i < numbers.length; i++) {
            for (int n = 1; n < numbers.length - i; n++) {
                if (numbers[n] < numbers[n - 1]) {
                    int sort = numbers[n];
                    numbers[n] = numbers[n - 1];
                    numbers[n - 1] = sort;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + ",");

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int n = 1; n < numbers.length - i; n++) {
                if (numbers[n] > numbers[n - 1]) {
                    int sort = numbers[n];
                    numbers[n] = numbers[n - 1];
                    numbers[n - 1] = sort;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
       }
    }
}

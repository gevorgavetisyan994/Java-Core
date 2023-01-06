package homework4;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 15, 68, 12, -8, 67, 168, 9, 55};

        // Տպեք մասիվի բոլոր զույգ էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("Even " + numbers[i] + ", ");
            }
        }
        System.out.println();
        // Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print("Odd " + numbers[i] + ", ");
            }

        }
        System.out.println();
// Տպեք զույգերի քանակը։
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.print("Even Count" + " " + evenCount);
        System.out.println();
// Տպեք կենտերի քանակը
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd Count" + " " + oddCount);
// Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        int result = 0;
        for (int i = 0; i < numbers.length; i++)
            result = result + numbers[i];
        System.out.println("Result" + " " + result / 10);


// Տպեք մասիվի էլեմենտների գումարը։

        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        System.out.println("Sum" + " " + sum);
// Տպեք մասիվի առաջին էլեմենտը։
        System.out.println("First element" + " " + numbers[0]);

// Տպեք մասիվի վերջին էլեմենտը։
        System.out.println("End elemnt" + " " + numbers[numbers.length - 1]);


// Տպեք մասիվի մեջտեղի էլեմենտը։
        System.out.println("Midpoint elemnt" + " " + numbers[numbers.length / 2]);

    }
}


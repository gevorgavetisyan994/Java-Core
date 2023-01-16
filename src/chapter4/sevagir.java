package chapter4;

public class sevagir {
    public static void main(String[] args) {
        for (int i = 0; i <= 13; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 36; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        int n = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        int k = 5;
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }
       // int l = 0;
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
           // l++;
            System.out.print(array[i] + " ");

        }
        System.out.println();
        //for (int i =0;j =)

    }
}




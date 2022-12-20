package homework.homework1;

import java.sql.SQLOutput;

public class IfForExample {
    public static void main(String[] args) {
        int a = 27;
        int b = 43;
        if (a < b) {
            System.out.println("max :" + b);
        }
        if (a > b) {
            System.out.println("max :" + a);
        }

        for (a = 27; a <= 43; a++) {
            System.out.print(a + ", ");
        }
        System.out.println();

        char c = (char) a;
        char c1 = (char) b;
        System.out.println(c);
        System.out.println(c1);
        if (a == b) {
            System.out.println("a equal b");
        } else {
            System.out.println("a no equal b");
        }
    }
}



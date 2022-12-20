package homework1;

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

        char x = 27;
        char y = 43;
        System.out.println(x);
        System.out.println(y);
        if (x == y) {
        System.out.println("x equal y");
        } else {
            System.out.println("x no equal y");
        }
    }
}



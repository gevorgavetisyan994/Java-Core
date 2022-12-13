package chapter2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IFSample {
    public static void main(String[] args) {
        int num = 10;
        if (num < 100) {
            System.out.println("num is less than 100");}
            int x, y;
            x = 10;
            y = 20;
            if (x < y) {
                System.out.println("x is less than y");}
                x = x * 2;
                if (x == y) {
                    System.out.println("x now equal to y");}
                    x = x * 2;
                    if (x > y) {
                        System.out.println("x now greather than y");}
                        if (x == y) {
                            System.out.println("you won't see this");}
                        }
                    }
package fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("entered number");

        int number = enteredNumber();

        System.out.println(fibonacciFirst(number));
        System.out.println(fibonacciSecond(number));
        System.out.println(fibonacciThird(number));

    }

    protected static int enteredNumber() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

    protected static int fibonacciFirst(int number) {

        if (number == 1 || number == 2) {
            return 1;
        } else {
            return fibonacciFirst(number - 1) + fibonacciFirst(number - 2);
        }
    }

    protected static int fibonacciSecond(int number) {

        int x = 1;
        int y = 1;

        for (int i = 2; i < number; i++) {
            y = x + y;
            x = y - x;
        }

        return y;
    }

    protected static int fibonacciThird(int number) {

        final double sqrtFrom5 = Math.sqrt(5);
        final double phi = (sqrtFrom5 + 1) / 2;

        return (int) (Math.pow(phi, number) / sqrtFrom5 + 0.5);

    }


}



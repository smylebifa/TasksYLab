import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // task1();
        // task2();
        task3();
        // task4();
    }

    public static void task1()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            int i;
            int j;
            for (i = 0; i < n; i++) {
                for (j = 0; j < m; j++) {
                    System.out.print(template);
                }
                System.out.println();
            }
        }
    }

    public static void task2()
    {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print ("Введите число от 0 до 30 : ");
            int n = scanner.nextInt();

            int m2 = 0;

            if (n > 30 || n < 0) {
                System.out.println ("Вы ввели не верное число");
            }
            else
            {
                if (n == 1) {
                    m2 = 1;
                }

                else
                {
                    int m0 = 0;
                    int m1 = 1;

                    for(int i = 1; i < n; i++){
                        m2 = 2 * m1 + m0;
                        m0 = m1;
                        m1 = m2;
                    }
                }
            }

            System.out.println(m2);
        }

    }

    public static void task3()
    {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    public static void task4()
    {
        int number = new Random().nextInt(100); // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");

        String resultOfGame = "Вы не угадали!";

        double user;
        int count = 0;

        do {

            System.out.println("Введите ваше число: ");

            Scanner input = new Scanner(System.in);

            user = input.nextDouble();

            if (user == number) {
                resultOfGame = "Вы угадали!";
                break;
            }

            else {

                if (user < number || user > number) {


                    if (number < user) {
                        System.out.println("Моё число меньше.");
                    } else {
                        System.out.println("Моё число больше.");
                    }
                }

                count++;

                System.out.println("Количество попыток " + (10 - count));
            }

        } while(count < 10);

        System.out.println(resultOfGame);
    }
}

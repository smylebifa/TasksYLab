import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // task1();
        // task2();
        // task3();
        task4();
    }

    // Array of characters
    public static void task1()
    {
        System.out.println("Введите размер строк, столбцов и символ");
        
        try (Scanner scanner = new Scanner(System.in)) {
            int stringSize = scanner.nextInt();
            int columnSize = scanner.nextInt();
            
            String template = scanner.next();

            for (int i = 0; i < stringSize; i++) {
                for (int j = 0; j < columnSize; j++) {
                    System.out.print(template);
                }
                System.out.println();
            }
        }
    }

    // Pell numbers
    public static void task2()
    {
        int userNumber;
        
        try (Scanner scanner = new Scanner(System.in)) {
          System.out.print("Введите число от 0 до 30 : ");
          userNumber = scanner.nextInt();
      }

            // Initial state for userNumber = 0
      int result = 0;

      if (userNumber > 30 || userNumber < 0) {
        System.out.println("Вы ввели не верное число");
    }
    else
    {
        if (userNumber == 1) {
            result = 1;
        }

        else
        {
            int x0 = 0;
            int x1 = 1;

            for(int i = 1; i < userNumber; i++){
                result = 2 * x1 + x0;
                x0 = x1;
                x1 = result;
            }
        }
    }

    System.out.println(result);

}

    // Multiplication table
public static void task3()
{
    for (int i = 1; i <= 9; i++) {
        for (int j = 1; j <= 9; j++) {
            System.out.println(i + " x " + j + " = " + (i * j));
        }
        System.out.println();
    }
}

    // Guess
public static void task4()
{
        int number = new Random().nextInt(100); // здесь загадывается число от 1 до 99
        int maxAttempts = 10; // здесь задается количество попыток
        System.out.println("Я загадал число. У тебя " + maxAttempts + " попыток угадать.");

        String resultOfGame = "Вы не угадали!";

        double userNumber;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Введите ваше число: ");

            
            userNumber = scanner.nextDouble();
            

            if (userNumber == number) {
                resultOfGame = "Вы угадали!";
                break;
            }

            else {

                if (userNumber < number || userNumber > number) {


                    if (number < userNumber) {
                        System.out.println("Моё число меньше.");
                    } else {
                        System.out.println("Моё число больше.");
                    }
                }

                count++;

                System.out.println("Количество попыток " + (maxAttempts - count));
            }

        } while(count < maxAttempts);

        scanner.close();

        System.out.println(resultOfGame);
    }
}

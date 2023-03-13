public class SequencesTest {
    public static void main(String[] args) {
        SequencesImpl sequences = new SequencesImpl();
        sequences.a(10);
        sequences.b(10);
        sequences.c(10);
        sequences.d(10);
        sequences.e(10);
        sequences.f(10);
        sequences.g(10);
        sequences.h(10);
        sequences.i(10);
        sequences.j(10);
    }


    public static class SequencesImpl implements Sequences{

        public void a(int count) {
            for (int element = 1; element <= count; element++) {
                System.out.print(element * 2 + " ");
            }
            System.out.println();
        }

        public void b(int count) {
            for (int element = 0; element < count; element++) {
                System.out.print(1 + element * 2 + " ");
            }
            System.out.println();
        }

        public void c(int count) {
            for (int element = 1; element <= count; element++) {
                System.out.print(element * element + " ");
            }
            System.out.println();
        }

        public void d(int count) {
            for (int element = 1; element <= count; element++) {
                System.out.print(element * element * element + " ");
            }
            System.out.println();
        }

        public void e(int count) {
            for (int index = 1, element = -1; index <= count; index++) {
                element = -1 * element;
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public void f(int count) {
            for (int index = 1, element = -1; index <= count; index++) {
                element = -1 * element;
                System.out.print(element * index + " ");
            }
            System.out.println();
        }

        public void g(int count) {
            for (int index = 1, element = -1; index <= count; index++) {
                element = -1 * element;
                System.out.print(element * index * index + " ");
            }
            System.out.println();
        }

        public void h(int count) {
            for (int index = 1, element = 1; index <= count; index++) {
                if (index % 2 != 0) {
                    System.out.print(element + " ");
                    element++;
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        public void i(int count) {
            for (int index = 1, element = 1; index <= count; index++) {
                element = element * index;
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public void j(int count) {

            if (count > 2)
            {
                System.out.print(1 + " " + 1  + " ");

                for (int index = 1, firstElement = 1, secondElement = 1, third_element = 0; index < count - 1; index++) {
                    third_element = firstElement + secondElement;
                    firstElement = secondElement;
                    secondElement = third_element;
                    System.out.print(third_element + " ");
                }
            }

            else if (count > 1)
            {
                System.out.print(1 + " " + 1  + " ");
            }

            else if (count > 0)
            {
                System.out.print(1 + " ");
            }

            System.out.println();

        }
    }

    public interface Sequences {
        /**
         * Выводит в консоль n первых членов последовательности A
         *
         * @param n число членов последовательности для вывода
         */
        public void a(int n);

        /**
         * Выводит в консоль n первых членов последовательности B
         *
         * @param n число членов последовательности для вывода
         */
        public void b(int n);

        /**
         * Выводит в консоль n первых членов последовательности C
         *
         * @param n число членов последовательности для вывода
         */
        public void c(int n);

        /**
         * Выводит в консоль n первых членов последовательности D
         *
         * @param n число членов последовательности для вывода
         */
        public void d(int n);

        /**
         * Выводит в консоль n первых членов последовательности E
         *
         * @param n число членов последовательности для вывода
         */
        public void e(int n);

        /**
         * Выводит в консоль n первых членов последовательности F
         *
         * @param n число членов последовательности для вывода
         */
        public void f(int n);

        /**
         * Выводит в консоль n первых членов последовательности G
         *
         * @param n число членов последовательности для вывода
         */
        public void g(int n);

        /**
         * Выводит в консоль n первых членов последовательности H
         *
         * @param n число членов последовательности для вывода
         */
        public void h(int n);

        /**
         * Выводит в консоль n первых членов последовательности I
         *
         * @param n число членов последовательности для вывода
         */
        public void i(int n);

        /**
         * Выводит в консоль n первых членов последовательности J
         *
         * @param n число членов последовательности для вывода
         */
        public void j(int n);
    }
}

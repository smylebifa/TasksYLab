import java.util.ArrayList;

public class StatsAccumulatorTest {

    public static void main(String[] args) {

        StatsAccumulator s = new StatsAccumulatorImpl(); // как то создается

        s.add(1);
        s.add(2);

        System.out.print("Cреднее арифметическое элементов: ");
        System.out.println(s.getAvg()); // 1.5 - среднее арифметическое элементов

        s.add(0);

        System.out.print("Минимальное число из переданных значений: ");
        System.out.println(s.getMin()); // 0 - минимальное из переданных значений

        s.add(3);
        s.add(8);

        System.out.print("Максимальное число из переданных значений: ");
        System.out.println(s.getMax()); // 8 - максимальный из переданных

        System.out.print("Количество переданных элементов: ");
        System.out.println(s.getCount()); // 5 - количество переданных элементов
    }

    public static class StatsAccumulatorImpl implements StatsAccumulator {

        private int count = 0;
        private int sum = 0;

        private int min = Integer.MAX_VALUE;
        private int max = Integer.MIN_VALUE;

        @Override
        public void add(int value) {
          count++;

          sum = sum + value;

          if (value > max) 
            max = value;

          if (value < min) 
            min = value;
        };

        @Override
        public int getMin() {
          return min;
        };

        @Override
        public int getMax() {
          return max;
        };

        @Override
        public int getCount() {
          return count;
        };

        @Override
        public Double getAvg() {
          return (double) sum / count;
        };
    }

    public interface StatsAccumulator {
        /**
         * Добавляет число в аккумулятор. Вызывается многократно
         *
         * @param value число
         */
        public void add(int value);

        /**
         * Возвращает минимальное из всех добавленных чисел
         *
         * @return минимальное из всех добавленных чисел
         */
        public int getMin();

        /**
         * Возвращает максимальное из всех добавленных чисел
         *
         * @return максимальное из всех добавленных чисел
         */
        public int getMax();

        /**
         * Возвращает количество всех добавленных чисел
         *
         * @return количество добавленных чисел
         */
        public int getCount();

        /**
         * Возвращает среднее арифметическое всех добавленных чисел
         *
         * @return среднее арифметическое всех добавленных
         */
        public Double getAvg();
    }

}

public class ComplexNumbersTest {
    public static void main(String[] args) {
        ComplexNumbers complexNumber1 = new ComplexNumbers(1.0, 2.0);
        ComplexNumbers complexNumber2 = new ComplexNumbers(2.0, 3.0);

        ComplexNumbers complexNumber3 = complexNumber1.addition(complexNumber2);
        complexNumber3 = complexNumber1.subtraction(complexNumber2);
        complexNumber3 = complexNumber1.multiplication(complexNumber2);

        complexNumber3 = new ComplexNumbers(3,4);

        complexNumber3.modulus();

        System.out.println(complexNumber3.toString());
    }

    static class ComplexNumbers {

        private double RealPart;
        private double ImaginaryPart;

        public ComplexNumbers(double realPart) {
            RealPart = realPart;
            ImaginaryPart = 0.0;
        }

        public ComplexNumbers(double realPart, double imaginary) {
            RealPart = realPart;
            ImaginaryPart = imaginary;
        }

        public ComplexNumbers addition(double realPartOfNumber2, double imaginaryPartOfNumber2) {
            double realPartOfSum = RealPart + realPartOfNumber2;
            double imaginaryPartOfSum = ImaginaryPart + imaginaryPartOfNumber2;

            System.out.print("Результат сложения комплексных чисел: ");

            if (imaginaryPartOfSum > 0) {
                System.out.println(realPartOfSum + " + " + imaginaryPartOfSum + "i");
            } else {
                System.out.println(realPartOfSum + " - " + (-1 * imaginaryPartOfSum) + "i");
            }

            return new ComplexNumbers(realPartOfSum, imaginaryPartOfSum);
        }

        public ComplexNumbers addition(ComplexNumbers complexNumber2) {
            double realPartOfSum = RealPart + complexNumber2.RealPart;
            double imaginaryPartOfSum = ImaginaryPart + complexNumber2.ImaginaryPart;

            System.out.print("Результат сложения комплексных чисел: ");

            if (imaginaryPartOfSum > 0) {
                System.out.println(realPartOfSum + " + " + imaginaryPartOfSum + "i");
            } else {
                System.out.println(realPartOfSum + " - " + (-1 * imaginaryPartOfSum) + "i");
            }

            return new ComplexNumbers(realPartOfSum, imaginaryPartOfSum);

        }

        public ComplexNumbers subtraction(double realPartOfNumber2, double imaginaryPartOfNumber2) {
            double realPartOfSub = RealPart - realPartOfNumber2;
            double imaginaryPartOfSub = ImaginaryPart - imaginaryPartOfNumber2;

            System.out.print("Результат разности комплексных чисел: ");

            if (imaginaryPartOfSub > 0) {
                System.out.println(realPartOfSub + " + " + imaginaryPartOfSub + "i");
            } else {
                System.out.println(realPartOfSub + " - " + (-1 * imaginaryPartOfSub) + "i");
            }

            return new ComplexNumbers(realPartOfSub, imaginaryPartOfSub);
        }

        public ComplexNumbers subtraction(ComplexNumbers complexNumber2) {
            double realPartOfSub = RealPart - complexNumber2.RealPart;
            double imaginaryPartOfSub = ImaginaryPart - complexNumber2.ImaginaryPart;

            System.out.print("Результат разности комплексных чисел: ");

            if (imaginaryPartOfSub > 0) {
                System.out.println(realPartOfSub + " + " + imaginaryPartOfSub + "i");
            } else {
                System.out.println(realPartOfSub + " - " + (-1 * imaginaryPartOfSub) + "i");
            }

            return new ComplexNumbers(realPartOfSub, imaginaryPartOfSub);
        }

        public ComplexNumbers multiplication(double realPartOfNumber2,double imaginaryPartOfNumber2) {

            double realPartOfMultiplication = RealPart * realPartOfNumber2 - ImaginaryPart * imaginaryPartOfNumber2;
            double imaginaryPartOfMultiplication = ImaginaryPart * realPartOfNumber2 + RealPart * imaginaryPartOfNumber2;

            System.out.print("Результат произведения комплексных чисел: ");

            if (imaginaryPartOfMultiplication > 0) {
                System.out.println(realPartOfMultiplication + " + " + imaginaryPartOfMultiplication + "i");
            } else {
                System.out.println(realPartOfMultiplication + " - " + (-1 * imaginaryPartOfMultiplication) + "i");
            }

            return new ComplexNumbers(realPartOfMultiplication, imaginaryPartOfMultiplication);
        }

        public ComplexNumbers multiplication(ComplexNumbers complexNumber2) {

            double realPartOfMultiplication = RealPart * complexNumber2.RealPart - ImaginaryPart * complexNumber2.ImaginaryPart;
            double imaginaryPartOfMultiplication = ImaginaryPart * complexNumber2.RealPart + RealPart * complexNumber2.ImaginaryPart;

            System.out.print("Результат произведения комплексных чисел: ");

            if (imaginaryPartOfMultiplication > 0) {
                System.out.println(realPartOfMultiplication + " + " + imaginaryPartOfMultiplication + "i");
            } else {
                System.out.println(realPartOfMultiplication + " - " + (-1 * imaginaryPartOfMultiplication) + "i");
            }

            return new ComplexNumbers(realPartOfMultiplication, imaginaryPartOfMultiplication);
        }

        public void modulus() {

            double modulus = Math.sqrt(RealPart * RealPart + ImaginaryPart * ImaginaryPart);

            System.out.print("Модуль комплексного числа: ");
            System.out.println(modulus);
        }


        @Override
        public String toString() {
            return "Комплексное число { "
            + "Действительная часть = " + RealPart + ", мнимая часть = " + ImaginaryPart + " }";
        }

    }
}

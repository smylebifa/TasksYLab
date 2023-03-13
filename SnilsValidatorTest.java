public class SnilsValidatorTest {
    public static void main(String[] args) {
        System.out.println(new SnilsValidatorImpl().validate("01468870570")); //false
        System.out.println(new SnilsValidatorImpl().validate("90114404441")); //true
    }

    static class SnilsValidatorImpl implements SnilsValidator{

        public boolean validate(String snils) {

            if (!snils.isEmpty())
            {
                int digitSnils, sum = 0;
                int checkDigit;
                char symbolOfSnils;

                for (int index = 0; index < 9; index++) {
                    symbolOfSnils = snils.charAt(index);
                    digitSnils = Character.digit(symbolOfSnils, 10);// конвертация символа в десятичное число
                    sum += digitSnils * (9 - index);
                }

                if (sum < 100)
                {
                    checkDigit = sum;
                }

                else if (sum == 100)
                {
                    checkDigit = 0;
                }

                else {
                    sum = sum % 101;

                    if (sum == 100) {
                        checkDigit = 0;
                    }
                    else {
                        checkDigit = sum;
                    }
                }

                String endSymbolsOfSnils = snils.substring(snils.length() - 2);
                String checkDigitStr = Integer.toString(checkDigit);

                if (endSymbolsOfSnils.equals(checkDigitStr)) {
                    return true;
                }
            }

            return false;
        }
    }

    public interface SnilsValidator {
        /**
         * Проверяет, что в строке содержится валидный номер СНИЛС
         * @param snils снилс
         * @return результат проверки
         */
        public boolean validate(String snils);
    }
}

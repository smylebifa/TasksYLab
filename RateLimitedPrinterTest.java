public class RateLimitedPrinterTest {

    public static void main(String[] args) {

        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(1000);

        for (int i = 0; i < 1_000_000_000; i++) {
            rateLimitedPrinter.print(String.valueOf(i), System.currentTimeMillis());
        }

    }

    static class RateLimitedPrinter {

        private int interval;
        long initialTimeL;

        public RateLimitedPrinter () {
            interval = 1;
            initialTimeL = System.currentTimeMillis();
        }

        public RateLimitedPrinter(int interval) {
            if (interval > 0)
            {
                this.interval = interval;
                initialTimeL = System.currentTimeMillis();
            }
        }

        public void print(String message, long currentTimeL) {
            if ((currentTimeL - initialTimeL) > this.interval) {
                initialTimeL = currentTimeL;
                System.out.println(message);
            }
        }
    }
}

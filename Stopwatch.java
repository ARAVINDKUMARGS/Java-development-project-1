public class Stopwatch {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Stopwatch Started...");
        for (int i = 0; i <= 10; i++) {
            System.out.print("\rTime: " + i + " seconds");
            Thread.sleep(1000);
        }
        System.out.println("\nStopwatch Ended.");
    }
}

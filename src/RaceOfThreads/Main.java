package RaceOfThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        RaceOfThreads raceOfThreads = new RaceOfThreads();

        ExecutorService executor = Executors.newFixedThreadPool(15);

        for (int i = 0; i < 10000; i++) {
            executor.execute(raceOfThreads);
        }
        executor.shutdown();

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Even Number : " + raceOfThreads.getEvenNumbers().size());
    }
}

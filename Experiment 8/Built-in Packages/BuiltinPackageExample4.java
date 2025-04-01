import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class BuiltinPackageExample4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        AtomicInteger counter = new AtomicInteger(0);
        
        System.out.println("Starting concurrent tasks...");
        
        for (int i = 1; i <= 5; i++) {
            final int taskNum = i;
            executor.submit(() -> {
                try {
                    System.out.println("Task " + taskNum + " started by " + 
                                      Thread.currentThread().getName());
                    Thread.sleep((long)(Math.random() * 1000));
                    
                    int newCount = counter.incrementAndGet();
                    System.out.println("Task " + taskNum + " completed. Counter: " + newCount);
                    
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                return null;
            });
        }
        
        executor.shutdown();
        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Not all tasks completed in time.");
                executor.shutdownNow();
            } else {
                System.out.println("\nAll tasks completed successfully.");
                System.out.println("Final counter value: " + counter.get());
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
}

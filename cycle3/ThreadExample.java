// Class to generate Fibonacci numbers
class FibonacciThread extends Thread {
    private int count;

    public FibonacciThread(int count) {
        this.count = count;
    }

    public void run() {
        int a = 0, b = 1, next;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // New line after Fibonacci
    }
}

// Class to display even numbers in a given range
class EvenNumberThread extends Thread {
    private int start, end;

    public EvenNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line after even numbers
    }
}

// Main class to start both threads
public class ThreadExample {
    public static void main(String[] args) {
        FibonacciThread fib = new FibonacciThread(10);  // Generate first 10 Fibonacci numbers
        EvenNumberThread even = new EvenNumberThread(1, 20); // Display even numbers between 1 and 20

        // Start both threads
        fib.start();
        even.start();
    }
}
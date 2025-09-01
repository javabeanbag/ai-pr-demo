public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // ❌ Bug: forgot to return
    public int subtract(int a, int b) {
        int c = a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

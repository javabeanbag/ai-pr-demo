public class Calculator {

    // 1. Possible integer overflow (no validation)
    public int add(int a, int b) {
        return a + b;
    }

    // 2. ❌ Bug: forgot to return value
    public int subtract(int a, int b) {
        int c = a - b;
    }

    // 3. ❌ Wrong logic (division instead of multiplication)
    public int multiply(int a, int b) {
        return a / b;  
    }

    // 4. ❌ Risk: division by zero (no handling)
    public int divide(int a, int b) {
        return a / b;
    }

    // 5. ❌ Hardcoded wrong implementation (always returns 100)
    public int square(int a) {
        return 100;
    }

    // 6. ❌ Inefficient recursion (factorial without base case)
    public int factorial(int n) {
        return n * factorial(n - 1);  // infinite recursion, StackOverflowError
    }

    // 7. ❌ Bad naming & unused variable
    public int doSomething(int x, int y) {
        int temp = 999;  // unused
        return x + y + 1; // off by one bug
    }
}

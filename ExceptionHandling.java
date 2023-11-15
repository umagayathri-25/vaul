public class ExceptionHandling {
public static void main(String[] args) {
int[] numbers = {1, 2, 3, 4, 5};
try {
System.out.println(numbers[10]);
int result = divide(10, 0);
System.out.println("Result: " + result);
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array index out of bounds.");
}
}
public static int divide(int a, int b) {
return a / b;
}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero*/
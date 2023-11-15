public class Fibonacci {
 public static int fibonacci(int n) {
if (n <= 1)
{
return n;
}
else{
return fibonacci(n-1) + fibonacci(n-2);
}
}
public static void main(String[] args) {
int n = 6;
int result = fibonacci(n);
System.out.println("The Fibonacci number at position " + n + " is: " + result);
}
}
/*method is declared as void and in main method result is int type so, I changed method type to int and output statments to return  */

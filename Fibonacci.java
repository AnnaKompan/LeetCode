public class Fibonacci {
    public static void main(String[] args){
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int n4 = 3;
        System.out.println("F(n) of " + n1 + " is " + calcFibonacci(n1));
        System.out.println("F(n) of " + n2 + " is " + calcFibonacci(n2));
        System.out.println("F(n) of " + n3 + " is " + calcFibonacci(n3));
        System.out.println("F(n) of " + n4 + " is " + calcFibonacci(n4));
    }

    public static int calcFibonacci(int n){
        if (n <= 1){
            return n;
        }
        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }
}

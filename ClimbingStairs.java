public class ClimbingStairs {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        System.out.println("There are " + climbStairs(n1) + " way(s) to climb to the top (1 or 2 steps each time)");
        System.out.println("There are " + climbStairs(n2) + " way(s) to climb to the top (1 or 2 steps each time)");
        System.out.println("There are " + climbStairs(n3) + " way(s) to climb to the top (1 or 2 steps each time)");
    }

    public static int climbStairs(int n){
        int a = 1;
        int b = 1;
        for (int i = 2; i < n + 1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}

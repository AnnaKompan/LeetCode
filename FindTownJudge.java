
import java.util.Arrays;

public class FindTownJudge {
    public static void main(String[] args) {
        int n1 = 2;
        int[][] trust1 = {{1,2}};
        System.out.println("The judge in" + Arrays.deepToString(trust1) + " is: " + FindJudge(n1,trust1));
    }

    public static int FindJudge(int n, int[][]trust) {
        int[] count = new int[n + 1];
        for (int[] t : trust) {
            count[t[0]]--;
            count[t[1]]++;
        }
        for (int i = 0; i <= n; i++) {
            if (count[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}

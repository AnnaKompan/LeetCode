import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = { { 1, 0 } };
        int numCourses2 = 2;
        int[][] prerequisites2 = { { 1, 0 }, { 0, 1 } };
        System.out.println("For first prerequisites: " + Arrays.deepToString(prerequisites1) + " can finish all courses is " + canFinish(numCourses1, prerequisites1));
        System.out.println("For first prerequisites: " + Arrays.deepToString(prerequisites1) + " can finish all courses is " + canFinish(numCourses2, prerequisites2));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        // 1) Build adjacency list graph, 1 list per course
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        // 2) For each pair in prerequisites, add directed edge(dependency of courses(a,b)-> a depends on b)
        for (int[] pr:prerequisites){
            graph.get(pr[1]).add(pr[0]);
        }
        // 3) Visited stores node state 0-not visited; 1-visiting; 2-visited
        int[] visited = new int[numCourses];

        // 4) Handle disconnected graphs, if there's cycle -> return False
        for (int c = 0; c < numCourses; c++){
            if(!dfs(c, graph, visited)){
                return false;
            }
        }
        return true;
    }

    // 5) if start is 2-already processed(true), if 1-cycle detected(false)
    public static boolean dfs(int start, List<List<Integer>> graph, int[] visited) {
        if (visited[start] == 2) {
            return true;
        }
        if (visited[start] == 1) {
            return false;
        }
        visited[start] = 1;
        
        // 6) if neighbor node leads to cycle - false
        for (int n: graph.get(start)) {
            if (!dfs(n, graph, visited)) {
                return false;
            }
        }
        visited[start] = 2;
        return true;
    } 
}

import java.util.*;

public class BeanGame {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {-1, 1, 0, 0, -1, 1, -1, 1};  // Directions for x (8 directions)
    static int[] dy = {0, 0, -1, 1, -1, -1, 1, 1};  // Directions for y (8 directions)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the grid size
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Input the charge matrix
        int[][] grid = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Starting point (x, y)
        int x = sc.nextInt() - 1;  // Convert to 0-based indexing
        int y = sc.nextInt() - 1;

        // Destination point (x', y')
        int xDest = sc.nextInt() - 1;  // Convert to 0-based indexing
        int yDest = sc.nextInt() - 1;

        // Calling the BFS to find the minimum cost
        int result = findMinimumCost(N, M, grid, x, y, xDest, yDest);
        System.out.println(result);
    }

    public static int findMinimumCost(int N, int M, int[][] grid, int x, int y, int xDest, int yDest) {
        // Priority queue for Dijkstra's Algorithm (min-heap based on cost)
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingInt(p -> grid[p.x][p.y]));
        
        // Cost array to track the minimum cost to reach each cell
        int[][] cost = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(cost[i], Integer.MAX_VALUE);
        }
        cost[x][y] = 0;
        
        pq.add(new Point(x, y));
        
        while (!pq.isEmpty()) {
            Point p = pq.poll();
            
            // If we've reached the destination, return the cost
            if (p.x == xDest && p.y == yDest) {
                return cost[xDest][yDest];
            }
            
            // Explore all 8 possible directions
            for (int i = 0; i < 8; i++) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                // Check if the new position is within bounds
                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    // Ensure that we are moving in a positive slope direction
                    if (nx > p.x && ny > p.y) {
                        // Calculate the cost to reach the next cell
                        int newCost = cost[p.x][p.y] + grid[nx][ny];
                        if (newCost < cost[nx][ny]) {
                            cost[nx][ny] = newCost;
                            pq.add(new Point(nx, ny));
                        }
                    }
                }
            }
        }
        
        // If destination is unreachable, return -1
        return -1;
    }
}

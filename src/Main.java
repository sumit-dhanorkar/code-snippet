import java.util.*;

public class Main {

    static class Cell {
        int x, y, cost;

        public Cell(int x, int y, int cost) {

            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }

    public static int minCost(int[][] matrix, int startX, int startY, int destX, int destY) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Directions for the 8 possible moves
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        // Visited array to track cells

        boolean[][] visited = new boolean[n][m];

        // PriorityQueue for BFS (min-heap based on cost)
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(cell -> cell.cost));

        // Add the starting cell to the queue

        pq.add(new Cell(startX - 1, startY - 1, 0));
        visited[startX - 1][startY - 1] = true;

        while (!pq.isEmpty()) {
            Cell current = pq.poll();

            // If destination is reached
            if (current.x == destX - 1 && current.y == destY - 1) {
                return current.cost;
            }

            // Explore all 8 possible moves

            for (int i = 0; i < 8; i++) {
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                // Check if the new cell is within bounds
                if (newX >= 0 && newX < n && newY >= 0 && newY < m) {
                    // Calculate slope and check if it's positive
                    if ((newY - current.y) * (newX - current.x) > 0) {
                        // If not visited, add it to the queue
                        if (!visited[newX][newY]) {
                            visited[newX][newY] = true;
                            pq.add(new Cell(newX, newY, current.cost + matrix[newX][newY]));
                        }
                    }
                }
            }
        }

        // If destination is not reachable

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input the matrix

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input start and destination coordinates
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int destX = sc.nextInt();
        int destY = sc.nextInt();

        // Calculate the minimum cost
        int result = minCost(matrix, startX, startY, destX, destY);

        // Print the result
        System.out.println(result);

        sc.close();
    }
}
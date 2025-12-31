import java.util.*;

class Solution {

    private int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};

    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 1, right = row * col;
        int answer = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canCross(row, col, cells, mid)) {
                answer = mid;      // crossing possible
                left = mid + 1;    // try later days
            } else {
                right = mid - 1;   // try earlier days
            }
        }
        return answer;
    }

    private boolean canCross(int row, int col, int[][] cells, int day) {
        int[][] grid = new int[row][col];

        // Flood cells up to 'day'
        for (int i = 0; i < day; i++) {
            int r = cells[i][0] - 1;
            int c = cells[i][1] - 1;
            grid[r][c] = 1; // water
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[row][col];

        // Start BFS from all land cells in top row
        for (int c = 0; c < col; c++) {
            if (grid[0][c] == 0) {
                queue.offer(new int[]{0, c});
                visited[0][c] = true;
            }
        }

        // BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0], c = curr[1];

            // Reached bottom row
            if (r == row - 1) return true;

            for (int[] d : directions) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < row && nc >= 0 && nc < col &&
                    !visited[nr][nc] && grid[nr][nc] == 0) {

                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}

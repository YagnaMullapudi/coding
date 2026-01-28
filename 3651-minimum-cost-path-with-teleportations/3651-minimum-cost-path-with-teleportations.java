import java.util.*;

class Solution {

    static class State {
        int r, c, t, cost;
        State(int r, int c, int t, int cost) {
            this.r = r;
            this.c = c;
            this.t = t;
            this.cost = cost;
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int INF = Integer.MAX_VALUE / 2;

        int[][][] dist = new int[m][n][k + 1];
        for (int[][] a : dist)
            for (int[] b : a)
                Arrays.fill(b, INF);

        // Cells sorted by value
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new int[]{grid[i][j], i, j});
        cells.sort(Comparator.comparingInt(a -> a[0]));

        // For each teleport count, track how many values processed
        int[] telePtr = new int[k + 1];

        PriorityQueue<State> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));

        dist[0][0][0] = 0;
        pq.add(new State(0, 0, 0, 0));

        int[] dr = {0, 1};
        int[] dc = {1, 0};

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            if (cur.cost != dist[cur.r][cur.c][cur.t]) continue;

            if (cur.r == m - 1 && cur.c == n - 1)
                return cur.cost;

            // Normal moves
            for (int d = 0; d < 2; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];
                if (nr < m && nc < n) {
                    int newCost = cur.cost + grid[nr][nc];
                    if (newCost < dist[nr][nc][cur.t]) {
                        dist[nr][nc][cur.t] = newCost;
                        pq.add(new State(nr, nc, cur.t, newCost));
                    }
                }
            }

            // Teleport moves (global expansion per t)
            if (cur.t < k) {
                while (telePtr[cur.t] < cells.size() &&
                       cells.get(telePtr[cur.t])[0] <= grid[cur.r][cur.c]) {

                    int[] cell = cells.get(telePtr[cur.t]++);
                    int nr = cell[1], nc = cell[2];

                    if (cur.cost < dist[nr][nc][cur.t + 1]) {
                        dist[nr][nc][cur.t + 1] = cur.cost;
                        pq.add(new State(nr, nc, cur.t + 1, cur.cost));
                    }
                }
            }
        }

        return -1;
    }
}

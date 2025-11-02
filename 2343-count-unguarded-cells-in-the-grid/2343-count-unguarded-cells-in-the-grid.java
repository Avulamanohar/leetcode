class Solution {
   public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
    int[][] grid = new int[m][n];

    // Initialize all cells as unguarded (-1)
    for (int i = 0; i < m; i++) {
        Arrays.fill(grid[i], -1);
    }

    // Mark walls as 1
    for (int[] wall : walls) {
        grid[wall[0]][wall[1]] = 1;
    }

    // Mark guards as 2
    for (int[] guard : guards) {
        grid[guard[0]][guard[1]] = 2;
    }

    // Left to right pass
    for (int i = 0; i < m; i++) {
        boolean guardSeen = false;
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == 2) guardSeen = true;
            else if (grid[i][j] == 1) guardSeen = false;
            else if (guardSeen) grid[i][j] = 0; // guarded
        }
    }

    // Right to left pass
    for (int i = 0; i < m; i++) {
        boolean guardSeen = false;
        for (int j = n - 1; j >= 0; j--) {
            if (grid[i][j] == 2) guardSeen = true;
            else if (grid[i][j] == 1) guardSeen = false;
            else if (guardSeen) grid[i][j] = 0; // guarded
        }
    }

    // Top to bottom pass
    for (int j = 0; j < n; j++) {
        boolean guardSeen = false;
        for (int i = 0; i < m; i++) {
            if (grid[i][j] == 2) guardSeen = true;
            else if (grid[i][j] == 1) guardSeen = false;
            else if (guardSeen) grid[i][j] = 0; // guarded
        }
    }

    // Bottom to top pass
    for (int j = 0; j < n; j++) {
        boolean guardSeen = false;
        for (int i = m - 1; i >= 0; i--) {
            if (grid[i][j] == 2) guardSeen = true;
            else if (grid[i][j] == 1) guardSeen = false;
            else if (guardSeen) grid[i][j] = 0; // guarded
        }
    }

    // Count unguarded cells
    int count = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (grid[i][j] == -1) {
                count++;
            }
        }
    }
    return count;
}

}
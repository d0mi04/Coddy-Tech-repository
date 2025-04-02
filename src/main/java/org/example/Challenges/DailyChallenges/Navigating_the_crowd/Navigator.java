package org.example.Challenges.DailyChallenges.Navigating_the_crowd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Navigator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] peopleGrid = createGrid(scanner.nextLine());
        String[] start = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");
        String[] end = scanner.nextLine().replaceAll("[\\[\\]]", "").split(", ");

        int[] startPosition = new int[start.length];
        int[] endPosition = new int[end.length];
        for(int i = 0; i < startPosition.length; i++) {
            startPosition[i] = Integer.parseInt(start[i]);
            endPosition[i] = Integer.parseInt(end[i]);
        }

        for (int[] ints : peopleGrid) {
            for (int j = 0; j < peopleGrid[0].length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.println();
        }

        System.out.printf("%d", navigateTheCrowd(peopleGrid, startPosition, endPosition));

    }
    // the solution will implement BFS, Breadth-First Search algorithm
    public static int navigateTheCrowd(int[][] peopleGrid, int[] startPosition, int[] endPosition) {
        // Write code here
        int rows = peopleGrid.length;
        int cols = peopleGrid[0].length;

        int[][]directions = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        // BFS queue: {row, col, steps}
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startPosition[0], startPosition[1], 0});

        boolean[][] visited = new boolean[rows][cols];
        visited[startPosition[0]][startPosition[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int r = current[0];
            int c = current[1];
            int steps = current[2];

            // end found, break
            if(r == endPosition[0] && c == endPosition[1]) {
                return steps;
            }

            for(int[] dir : directions) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if(newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    // is position occupied by taller?
                    if(peopleGrid[newRow][newCol] < 2 && !visited[newRow][newCol]) {
                        queue.offer(new int[]{newRow, newCol, steps +1});
                        visited[newRow][newCol] = true;
                    }
                }
            }
        }

        return -1;
    }

    public static int[][] createGrid(String input) {
        input = input.replaceAll("\\[\\[", "").replaceAll("]]", "").replaceAll("], \\[", ";");
        String[] rows = input.split(";");
        int[][] grid = new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            grid[i] = Arrays.stream(rows[i].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return grid;
    }
}

package org.example.Coding_Problems;

import java.util.*;

public class Example_31 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        final int HEIGHT = scan.nextInt();
        final int WIDTH = scan.nextInt();

        int needToBePainted = scan.nextInt();
        int alreadyPainted = scan.nextInt();

        List<int[]> paintedHouses = new ArrayList<>();
        for(int i = 0; i < alreadyPainted; i++) {
            paintedHouses.add(new int[]{scan.nextInt(), scan.nextInt()});
        }

        System.out.printf("%d", paintHouses(HEIGHT, WIDTH, needToBePainted, paintedHouses));
        scan.close();
    }

    public static int paintHouses(int HEIGHT, int WIDTH, int needToBePainted, List<int[]> paintedHouses) {
        int[][] map = new int[HEIGHT][WIDTH];
        Queue<int[]> queue = new LinkedList<>();
        int alreadyPainted = 0;

        for(int[] house : paintedHouses) {
            int x = house[0] - 1;
            int y = house[1] - 1;
            map[x][y] = 1;
            queue.offer(new int[]{x, y});
            alreadyPainted++;
        }

        int months = 0;
        int[][] directions = {
                {-1, 0},
                {1, 0},
                {0, -1},
                {0, 1}
        };

        // BFS:
        while(alreadyPainted < needToBePainted) {
            int size = queue.size();
            if(size == 0) {
                return -1;
            }

            months++;
            for(int i = 0; i < size; i++) {
                int[] house = queue.poll();
                int x = house[0];
                int y = house[1];

                for(int[] dir : directions) {
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    if(newX >= 0 && newX < HEIGHT && newY >= 0 && newY < WIDTH && map[newX][newY] == 0) {
                        map[newX][newY] = 1;
                        queue.offer(new int[]{newX, newY});
                        alreadyPainted++;

                        if(alreadyPainted == needToBePainted) {
                            return months;
                        }
                    }
                }
            }
        }
        return months;
    }
}

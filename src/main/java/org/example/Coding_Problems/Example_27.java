package org.example.Coding_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example_27 {
    public static void main(String[] args) {
        // Write code here
        Scanner scan = new Scanner(System.in);
        char currentCol = scan.next().charAt(0);
        int currentRow = scan.nextInt();
        int count = scan.nextInt();
        int attackCount = 0;
        for(int i = 0; i < count; i++) {
            char attackedCol = scan.next().charAt(0);
            int attackedRow = scan.nextInt();
            if(isAttacked(currentCol, currentRow, attackedCol, attackedRow)) {
                attackCount++;
            }
        }
        System.out.printf("%d", attackCount);
        scan.close();
    }

    public static boolean isAttacked(char currentCol, int currentRow, char attackedCol, int attackedRow) {
        Map<Character, Integer> board = new HashMap<>();
        board.put('a', 1);
        board.put('b', 2);
        board.put('c', 3);
        board.put('d', 4);
        board.put('e', 5);
        board.put('f', 6);
        board.put('g', 7);
        board.put('h', 8);

        if(board.get(currentCol) + 2 == board.get(attackedCol) || board.get(currentCol) - 2 == board.get(attackedCol)) {
            return currentRow + 1 == attackedRow || currentRow - 1 == attackedRow;
        } else if (board.get(currentCol) + 1 == board.get(attackedCol) || board.get(currentCol) - 1 == board.get(attackedCol)) {
            return currentRow + 2 == attackedRow || currentRow - 2 == attackedRow;
        }
        return false;
    }
}

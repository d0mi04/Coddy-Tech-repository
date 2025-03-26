package org.example.Coding_Problems;

import java.util.Scanner;
public class Example_3 {
    public static void main(String[] args) {
        // Write code here
        // InputStream input = System.in;
        // Reader inputReader = new InputStreamReader(input);
        // BufferedReader bufferReader = new BufferedReader(inputReader);
        // int number = Integer.parseInt(bufferReader.readLine());
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.printf("%d %d", square(number), cube(number));

        scanner.close();

    }

    public static int square (double n) {
        return (int)Math.pow(n, 2);
    }

    public static int cube (double n) {
        return (int)Math.pow(n, 3);
    }
}

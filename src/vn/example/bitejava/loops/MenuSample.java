package vn.example.bitejava.loops;

import java.util.Scanner;

public class MenuSample {

    // Biến global
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Enter your selection");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            // Kết hợp switch case để giải quyết sự lựa chọn
            switch (choice) {
                case 1:
                    rectangle();
                    break;
                case 2:
                    squareTriangle();
                    break;
                case 3:
                    isoscelesTriangle();
                    break;
                default:
                    return;
            }
        }
    }

    // Function in ra hình chữ nhật
    private static void rectangle() {
        System.out.print("Hãy nhập vào chiều dài: ");
        int width = sc.nextInt();
        System.out.print("Hãy nhập vào chiều rộng: ");
        int height = sc.nextInt();
        // Lặp qua các dòng
        for (int row = 0; row < height; row++) {
            // Lăp qua các cột
            for (int col = 0; col < width; col++) {
                System.out.print("*");
            }
            // Chuyển sang dòng tiếp theo
            System.out.println();
        }
    }

    // In ra các loại tam giác
    private static void squareTriangle() {
        System.out.print("Hãy nhập vào kích thước: ");
        int size = sc.nextInt();
        // Góc vuông bên trái
        System.out.println("Top-left corner triangle:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Top-right corner triangle
        System.out.println("Top-right corner triangle:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col <= size - row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Bottom-left corner triangle
        System.out.println("Bottom-left corner triangle:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col <= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Bottom-right corner triangle
        System.out.println("Bottom-right corner triangle:");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col <= size - row + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void isoscelesTriangle() {
        System.out.print("Hãy nhập vào chiều cao tam giác cân: ");
        int size = sc.nextInt();
        // Lặp qua các dòng
        for (int row = 1; row <= size; row++) {
            //
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }

            System.out.println();  // Move to the next line
        }
    }

}

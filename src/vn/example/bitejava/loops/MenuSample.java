package vn.example.bitejava.loops;

import java.util.Scanner;

public class MenuSample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    System.out.println("Chọn 1");
                    break;
                case 2:
                    System.out.println("Chọn 2");
                    break;
                case 3:
                    System.out.println("Chọn 3");
                    break;
                default:
                    return;
            }
        }
    }

}

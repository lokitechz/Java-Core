package vn.example.bitejava.loops;

import java.util.Scanner;

public class Caculator {

    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Hãy nhập vào 1 số bất kì");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("Kết quả: " + sum);
    }

}

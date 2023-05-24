package vn.example.bitejava.io;

import java.util.Scanner;

public class IOConsole {

    public static void main(String[] args) {
        // Khai báo đối tượng scanner để quét những kí tự từ bán phím
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }

}

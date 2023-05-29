package vn.example.bitejava.arrays;

import java.util.Scanner;

// Method có 2 kiểu 1 là trả về dữ liệu 2 là void chỉ thực hiện nhưng k trả về dữ liệu
// Method void k cần return
public class Methods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào 1 số bất kì: ");
        int num = scanner.nextInt();
        boolean result = isEven(num);
        System.out.println("kết quả là: " + result);
        int a = scanner.nextInt();
        print(a);
    }

    // Có trả về dữ liệu cùng kiểu đã định nghĩa ở method
    // Bắt buộc phải có return
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Chỉ thực hiện ko trả về giá trị (ko cần return)
    public static void print(int a) {
        System.out.println("Test void: " + a);
    }

}

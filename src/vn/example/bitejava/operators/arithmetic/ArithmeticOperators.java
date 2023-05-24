package vn.example.bitejava.operators.arithmetic;

public class ArithmeticOperators {

    // Toán tử số học
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println("Toán tử Addition (Sử dụng để cộng 2 giá trị)");
        System.out.println("Tổng 2 số: " + (x + y));
        System.out.println("Toán tử Subtraction (Sử dụng để trừ 2 giá trị)");
        System.out.println("Hiệu 2 số: " + (x - y));
        System.out.println("Toán tử Multiplication (Sử dụng để nhân 2 giá trị)");
        System.out.println("Tích 2 số: " + (x * y));
        System.out.println("Toán tử Division (Sử dụng để chia 2 giá trị)");
        x = 12;
        System.out.println("Thương 2 số: " + (x / y));
        System.out.println("Toán tử Modulus (Sử dụng lấy phần dư của phép chia)");
        y = 5;
        System.out.println("Phần dư: " + (x % y));
        System.out.println("Toán tử Increment (Sử dụng để tăng giá trị của biến 1 đơn vị)");
        System.out.println("Giá trị sau khi tăng: " + (++x));
        System.out.println("Toán tử Decrement (Sử dụng để giảm giá trị của biến 1 đơn vị)");
        System.out.println("Giá trị sau khi tăng: " + (--x));
    }

}

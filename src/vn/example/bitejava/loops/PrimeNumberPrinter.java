package vn.example.bitejava.loops;

public class PrimeNumberPrinter {

    public static void main(String[] args) {
        int count = 0; // Đếm số nguyên tố đã tìm thấy
        int number = 2; // Số cần kiểm tra là số nguyên tố

        System.out.println("20 số nguyên tố đầu tiên:");

        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Kiểm tra xem một số có phải là số nguyên tố hay không
    // Số nguyên tố là số tự nhiên lớn hơn 1 chỉ chia hết cho 1 và chính nó
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}

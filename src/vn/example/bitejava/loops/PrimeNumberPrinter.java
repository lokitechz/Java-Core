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

        // Tại sao cần lấy căn bậc 2
        // Bình thường sẽ đi kiểm tra tất cả các số nhỏ hơn num - 1 để xem có chia hết cho số nào k
        // Nếu số to sẽ rất mất thời gian và ko tốt về mặt code
        // Vì sao chỉ cần kiểm tra với
        // Bằng cách lấy căn bậc 2 của num, chúng ta chỉ cần kiểm tra xem num có chia hết
        // cho các số nguyên từ 2 đến căn bậc 2 của num hay không.
        // Nếu num không chia hết cho bất kỳ số nguyên nào trong khoảng này,
        // nó sẽ không chia hết cho bất kỳ số nguyên nào lớn hơn căn bậc 2 của nó.
        // Nếu a và b lớn hơn căn bậc hai của n, tức là a > sqrt(n) và b > sqrt(n),
        // thì tích của hai số đó sẽ vượt quá giá trị n.
        // VD: Bt nếu kiểm tra từ 2 đến 24
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

}

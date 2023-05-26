package vn.example.bitejava.datatype;

import java.util.Scanner;

/**
 * Class chữa bài tập buổi 2
 */
public class Lesson2 {

    // Khai báo mảng lưu trữ những số từ 0 đến 19
    private static final String[] ones = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    // Khai báo mảng lưu trữ những số tròn chục từ 10 -> 90 cho các trường hợp
    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    // Khai báo mảng lưu trữ đơn vị đếm
    private static final String[] scales = {
            "", "thousand", "million", "billion"
    };

    public static void main(String[] args) {
        // Khai báo đối tương scanner để quét những kí tự người dùng nhập vào bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên không âm (từ 0 đến 999): ");
        // Sử dụng hàm nextInt để lấy đc số
        int number = scanner.nextInt();

        // Kiểm tra số nhỏ hơn 0 hoặc lớn hơn 999
        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ!");
        } else {
            // Khai báo biến words để lưu giữ kết quả của hàm convertNumberToWords
            String words = convertNumberToWords(number);
            System.out.println("Kết quả: " + words);
        }
    }

    // Hàm convertNumberToWords nhận vào tham số là số từ người dùng nhập vào
    public static String convertNumberToWords(int number) {
        // Nếu là số 0 thì return từ zero
        if (number == 0) {
            return "zero";
        }

        // Tạo biến words để lưu giữ kết quả
        StringBuilder words = new StringBuilder();

        // Biến tăng
        int scaleIndex = 0;

        while (number > 0) {
            // Chia lấy phần dư với 1000
            int hundred = number % 1000;
            System.out.println("Số dư khi thực hiện phép chia với 1000: " + hundred);
            // So sánh phần dư của phép lấy phần dư xem có khác 0 không
            if (hundred != 0) {
                String currentWords = convertThreeDigitNumberToWords(hundred);
                words = new StringBuilder(currentWords + " " + scales[scaleIndex] + " " + words);
            }
            // Chia và gán số hiện có cho 1000
            number /= 1000;
            scaleIndex++;
        }

        return words.toString().trim();
    }

    public static String convertThreeDigitNumberToWords(int number) {
        // VD: 110
        String words;

        // 31 : 100 = 31
        if (number % 100 < 20) {
            // Phần dư < 20 (19 < 20)
            // Lấy vị trí của từ để tìm kiếm trong mảng từ điển
            int index = number % 100;
            System.out.println("Vị trí của từ trong mảng từ điên ones đã khai báo ở trên: " + index);
            // Lấy từ trong mảng ones đã khai báo
            // Lấy vị trí 19 trong từ điển ones
            words = ones[index];
            // Chia số đang có cho 100 sau đó gán lại
            number /= 100;
            System.out.println("Số còn lại sau khi chia và gán: " + number);
        } else {
            // Phần dư > 20
            int index = number % 10;
            System.out.println("Vị trí của từ trong mảng từ điển ones: " + index);
            // Tìm từ trong mảng ones
            words = ones[index];
            // Chia và gán số cho 10
            number /= 10;
            // Lấy số ở bước trên tìm từ trong mảng tens sau đó cộng với chuỗi words ở trên
            words = tens[number % 10] + " " + words;
            // Chia và gán phần còn lại cho 10
            number /= 10;
        }

        // Kiểm tra nếu số bằng 0 thì thì return từ đã có
        if (number == 0) {
            return words;
        }

        //
        return ones[number] + " hundred " + words;
    }

}

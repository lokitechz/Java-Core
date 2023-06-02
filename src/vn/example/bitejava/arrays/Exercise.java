package vn.example.bitejava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    // Biến global
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            System.out.println("Nhập chức năng mà bạn muốn chạy");
            System.out.println("1. Xoá phần tử khỏi mảng");
            System.out.println("2. Thêm phần tử vào mảng");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            // Kết hợp switch case để giải quyết sự lựa chọn
            switch (choice) {
                case 1:
                    ex1();
                    break;
                case 2:
                    ex2();
                    break;
                case 3:
                    break;
                default:
                    return;
            }
        }
    }

    // Xoá phần tử khỏi mảng
    private static void ex1() {
        int[] numbers = {1, 5, 3, 6, 4};
        System.out.println("Giá trị ban đầu của mảng: " + Arrays.toString(numbers));
        System.out.print("Nhập vào phần tử bạn muốn xoá: ");
        int num = sc.nextInt();
        // Tìm vị trí của phần tử cần xóa trong mảng
        boolean isFind = false;
        int delIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                isFind = true;
                delIndex = i;
                break;
            }
        }
        // Xoá phần tử đó
        if (isFind) {
            // Tạo một mảng mới có kích thước nhỏ hơn mảng ban đầu
            int[] newNumbers = new int[numbers.length - 1];
            // Sao chép các phần tử từ mảng ban đầu sang mảng mới, loại bỏ phần tử cần xóa
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (i != delIndex) {
                    newNumbers[j++] = numbers[i];
                }
            }
            System.out.println("Phần tử " + num + " đã được xóa khỏi mảng.");
            System.out.println("Giá trị mới của mảng: " + Arrays.toString(newNumbers));
        } else {
            System.out.println("Phần tử " + num + " không tồn tại trong mảng.");
        }
    }

    // Thêm phần tử vào mảng
    private static void ex2() {
        int[] numbers = {1, 5, 3, 6, 4};
        System.out.println("Giá trị ban đầu của mảng: " + Arrays.toString(numbers));
        int length = numbers.length;
        // Nhập giá trị cần chèn
        System.out.print("Nhập giá trị cần chèn: ");
        int value = sc.nextInt();
        // Nhập vị trí cần chèn
        System.out.print("Nhập vị trí cần chèn (từ 0 đến " + (length - 1) + "): ");
        int position = sc.nextInt();
        // Kiểm tra vị trí hợp lệ
        if (position < 0 || position > length - 1) {
            System.out.println("Vị trí không hợp lệ!");
        } else {
            // Tạo mảng mới có kích thước lớn hơn mảng ban đầu
            int[] newNumbers = new int[length + 1];
            // Chép các phần tử từ mảng ban đầu vào mảng mới
            // i là index ở mảng ban đầu, j là index ở mảng mới
            for (int i = 0, j = 0; i < length; i++, j++) {
                // Nếu vị trí ở mảng ban đầu trùng với vị trí mà bạn muốn chèn giá trị
                // Thay thế giá trị bạn muốn chèn vào mảng mới ở vị trí j
                if (i == position) {
                    newNumbers[j] = value;
                    j++;
                }
                // Chép giá trị từ mảng ban đầu sang mảng mới
                newNumbers[j] = numbers[i];
            }
            // Hiển thị mảng sau khi chèn
            System.out.println("Mảng sau khi chèn: " + Arrays.toString(newNumbers));
        }
    }

}

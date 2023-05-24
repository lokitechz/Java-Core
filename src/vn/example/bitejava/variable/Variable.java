package vn.example.bitejava.variable;

public class Variable {

    public static void main(String[] args) {
        // Naming Conventions (Các quy tắc đặt tên biến)
        // 1.Chữ cái đầu tiên viết thường các từ trong cùng 1 biến bắt đầu bằng chữ hoa.
        // 2.Tên biến nên viết ngắn gọn nhưng đầy đủ ý nghĩa (bằng tiếng anh).
        // 3.Việc lựa chọn một tên biến phải mang tính gợi nhớ.
        // 4.Tên biến không được bắt đầu bằng dấu gạch dưới _ hoặc ký tự đô la $, mặc dù cả hai đều được phép.
        // 5.Nên tránh đặt tên biến có một ký tự ngoại trừ các biến tạm thời.
        // 6.Tên thông thường của các biến tạm thời là i, j, k, m và n cho số nguyên; c, d và e cho các ký tự.
        int x = 1;
        int i = 1, j = 2;
        System.out.println("Giá trị của biến x: " + x);
        System.out.println("Result i + j = " + (i+j));
    }

}

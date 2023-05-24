package vn.example.bitejava.operators.logical;

public class LogicalOperators {

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Toán tử && trả về true khi cả 2 mệnh đề đều đúng");
        System.out.println("Kết quả: " + (x > 3 && x < 10));
        System.out.println("Toán tử || trả về true khi 1 trong 2 mệnh đề đúng");
        System.out.println("Kết quả: " + (x > 3 || x < 4));
        System.out.println("Toán tử ! trả về phủ định của mệnh đề");
        // x < 5 = false -> phủ định của false = true
        System.out.println("Kết quả: " + (!(x < 5)));
    }

}

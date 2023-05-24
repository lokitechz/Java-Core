package vn.example.bitejava.operators.comparison;

public class ComparisonOperators {

    // Comparision Operator chỉ trả về 2 giá trị là true(đúng) hoặc false(sai)
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println("Toán tử == (Equal to)");
        System.out.println("X bằng Y: " + (x == y));
        System.out.println("Toán tử != (Not equal)");
        System.out.println("X khác Y: " + (x != y));
        System.out.println("Toán tử > (Greater than)");
        System.out.println("X > Y: " + (x > y));
        System.out.println("Toán tử < (Less than)");
        System.out.println("X < Y: " + (x < y));
        System.out.println("Toán tử >= (Greater than or equal)");
        System.out.println("X > Y: " + (x >= y));
        System.out.println("Toán tử <= (Less than or equal)");
        System.out.println("X < Y: " + (x <= y));
    }

}

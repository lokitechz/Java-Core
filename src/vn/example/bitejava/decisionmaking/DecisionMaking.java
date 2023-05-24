package vn.example.bitejava.decisionmaking;

public class DecisionMaking {

    public static void main(String[] args) {
        int x = 5, y = 10;
        // Ví dụ về if
        if (x > 3) {
            System.out.println("X lớn hơn 3");
        }
        // Ví dụ về if-else
        if (x > y) {
            System.out.println("X lớn hơn Y");
        } else {
            System.out.println("Y lớn hơn X");
        }
        // Ví dụ về if-else lồng
        if (x > 5) {
            if (x > 3) {
                // true-block statement(s);
            } else {
                // false-block statement(s);
            }
        } else {
            // false-block statement(s);
        }
        // Ví dụ switch-case


    }

}

package vn.example.bitejava.decisionmaking;

public class DecisionMaking {

    public static void main(String[] args) {
        int x = 5, y = 10;
        // Ví dụ về if nếu thoả mãn điều kiện trong ngoặc tròn thì đoạn code sẽ được cháy
        if (x > 6) {
            // Block code nằm trong ngoặc nhọn
            System.out.println("Tôi lớn hơn 3 các bạn nè");
        }

        // Ví dụ về if-else
        if (x > y) {
            // Nếu mệnh đề trong if đúng thì chạy
            System.out.println("X lớn hơn Y");
        } else if (x == y) {
            System.out.println("X bằng Y");
        } else {
            // Chạy trong các trường hợp ngược lại
            System.out.println("Y lớn hơn X");
        }

        // Ví dụ về switch-case
        switch (x) {
            // Nếu x = 1
            case 1:
                System.out.println("Rơi vào case 1");
                break;

            case 2:
                System.out.println("Rơi vào case 2");
                break;

            case 3:
                System.out.println("Rơi vào case 3");
                break;

            // Không bắt buộc nhưng nên có (khi đi làm)
            default:
                System.out.println("Đây là trường hợp default");
        }

    }

}

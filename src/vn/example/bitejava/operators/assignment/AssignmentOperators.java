package vn.example.bitejava.operators.assignment;

public class AssignmentOperators {

    // Toán tử gán
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Toán tử = (gán giá trị cho x): " + x);
        x += 3;
        System.out.println("Toán tử += (tăng và gán giá trị cho x): " + x);
        x -= 3;
        System.out.println("Toán tử -= (giảm và gán giá trị cho x): " + x);
        x *= 3;
        System.out.println("Toán tử *= (nhân và gán giá trị cho x): " + x);
        x /= 3;
        System.out.println("Toán tử /= (chia và gán giá trị cho x): " + x);
        x %= 3;
        System.out.println("Toán tử %= (lấy phần dư và gán giá trị cho x): " + x);
        // Mở rộng (Toán tử bit)
        // Là toán tử nhị phân
        // https://www.geeksforgeeks.org/bitwise-operators-in-java/
        x &= 3;
        // Bitwise AND Operation of 2 and 3 (Và)
        // Nếu cả 2 bit đều = 1 thì hiển thị 1, ngược lại thì hiển thị 0
        // 2 =        10
        // 3 =     &  11
        // -------------
        //            10 = 2 (In decimal)
        System.out.println("Toán tử &=: " + x);
        x = 2;
        x |= 3;
        // Bitwise OR Operation of 2 and 3 (Hoặc)
        // Nếu 1 trong 2 bit = 1 thì hiển thị 1, ngược lại hiển thị 0.
        // 2 =        10
        // 3 =     |  11
        // -------------
        //            11 = 3 (In decimal)
        System.out.println("Toán tử |=: " + x);
        // Bitwise XOR Operation of 2 and 3 (Hoặc)
        // Nếu các bit tương ứng khác nhau hiển thị 1, ngược lại hiển thị 0.
        // 2 =        10
        // 3 =     ^  11
        // -------------
        //            01 = 1 (In decimal)
        x = 2;
        x ^= 3;
        System.out.println("Toán tử ^=: " + x);
        // Bitwise Right Shift (Dịch phải theo bit)
        // 5 =       101
        //        >>   1 (Dịch sang phải 1 bit)
        // -------------
        //            10 = 2 (In decimal)
        x = 5;
        x >>= 1;
        System.out.println("Toán tử Right Shift: " + (x));
    }

}

package vn.example.bitejava.arrays;

import java.util.Arrays;

public class ArraysSample {

    public static void main(String[] args) {
        // Khởi tạo 1 mảng String có tên là names và độ dài là 10
        // Trong mảng tối đa có thể lưu 10 phần tử
//        String[] names = new String[10];

        // Khai báo 1 mảng
//        String names[] = new String[10];

        // Khai báo 1 mảng có sẵn giá trị
        String[] names = {"Giang", "Giang 1", "Giang 2"};


        // Sử dụng foreach
        for (String name : names) {
            System.out.println("Tên tôi là " + name);
        }

        // Sử dụng for
        for (int i = 0; i < names.length; i++) {
            System.out.println("Tên tôi là " + names[i]);
        }

        double[] myDoubles = new double[10];
        // Gán giá trị cho từng phần tử trong mảng
        myDoubles[0] = 5.6;
        myDoubles[2] = 3.14;
        System.out.println(myDoubles.length);
        System.out.println(Arrays.toString(myDoubles));
    }

}

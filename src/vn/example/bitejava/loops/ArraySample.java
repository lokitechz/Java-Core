package vn.example.bitejava.loops;

public class ArraySample {

    public static void main(String[] args) {
        String[] students = {"Dương", "Hoàng", "Giang"};
        // Vòng lặp for index
        // Biết trước số vòng lặp
        System.out.println("Vòng lặp for");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // Vòng lặp for each
        System.out.println("Vòng lặp foreach");
        for (String student : students) {
            System.out.println(student);
        }

        // Vòng lặp while
        System.out.println("Vòng lặp while");
        int i = 0;
        while (i < students.length) {
            System.out.println(students[i]);
            i++;
        }
    }

}

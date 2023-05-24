package vn.example.bitejava.datatype;

public class TypeCasting {

    public static void main(String[] args) {
        // Widening Casting (automatically): byte -> short -> char -> int -> long -> float -> double
        int xInt = 9;
        double xDouble = xInt;
        System.out.println("Widening Casting (Nới rộng)");
        System.out.println(xInt);
        System.out.println(xDouble);
        System.out.println("====================");
        double myDouble = 9.78d;
        // Narrowing Casting (manually): double -> float -> long -> int -> char -> short -> byte
        int myInt = (int) myDouble; // Manual casting: double to int
        System.out.println("Narrowing Casting (Thu hẹp)");
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }

}

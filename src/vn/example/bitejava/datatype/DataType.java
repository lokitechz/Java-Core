package vn.example.bitejava.datatype;

/**
 * Class giới thiệu những kiểu dữ liệu nguyên thuỷ trong java
 */
public class DataType {

    public static void main(String[] args) {
        // Có 8 kiểu dữ liệu nguyên thuỷ trong java (primitive data)
        byte aByte;            //  1 byte  Stores whole numbers from -128 to 127
        short aShort;       //  2 bytes Stores whole numbers from -32,768 to 32,767
        int aInt;           //  4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long aLong;         //  8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float aFloat;        //  4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double aDouble;     //	8 bytes	Stores fractional numbers. Sufficient for storing
        boolean aBoolean;   //	1 bit	Stores true or false values. A bit is considered to be the smallest unit of data measurement (0 or 1)
        char aChar;      //  2 bytes	Stores a single character/letter or ASCII values

        System.out.println("Ví dụ về các kiểu dữ liệu trong JAVA");
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu byte");
        aByte = 1;
        // Chuỗi cộng với số (chuỗi + chuỗi)
        System.out.println("Giá trị của aByte: " + aByte);
        // In java characters are represented using Unicode,
        // which is a standardized character encoding system
        // Each character in Unicode is assigned a unique code point,
        // which is a numerical value that represents the character
        aByte = 'a';
        // Its Unicode code point is.
        // Tham khảo: https://www.rapidtables.com/code/text/ascii-table.html
        System.out.println("Giá trị của aByte: " + aByte);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu short");
        aShort = 128;
        System.out.println("Giá trị của aShort: " + aShort);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu int");
        aInt = 128;
        System.out.println("Giá trị của aInt: " + aInt);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu long");
        aLong = 128;
        System.out.println("Giá trị của aLong: " + aLong);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu float");
        aFloat = 128;
        System.out.println("Giá trị của aFloat: " + aFloat);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu double");
        aDouble = 128;
        System.out.println("Giá trị của aDouble: " + aDouble);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu boolean");
        aBoolean = true;
        System.out.println("Giá trị của aBoolean: " + aBoolean);
        System.out.println("============================================================");
        System.out.println("Kiểu dữ liệu char");
        aChar = 'a';
        System.out.println("Giá trị của aChar: " + aChar);
        System.out.println("============================================================");
    }

}

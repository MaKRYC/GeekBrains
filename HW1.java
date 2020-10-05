public class HW1 {
    public static void main(String[] args) {
        boolean boo = true;
        byte by = 1;
        short sh = 1;
        int in = 1;
        long l = 1L;
        double d = 1.1;
        float f = 1.1F;

//        point 3
//        System.out.println(multiply(35, 54, 11, 24));

//        point 4
//        System.out.println(getRange(20, 9));

//        point 5
//        checkPositive(0);

//        point 6
//        System.out.println(getNegative(0));

//        point 7
//        printName("Bill");

//        point 8
//        checkYear(2020);

    }

    public static int multiply(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean getRange(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkPositive(int a){
        if(a > 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean getNegative(int a){
        boolean result = false;
        if (a < 0){
            result = true;
        }
        return result;
    }

    public static void printName(String name){
        System.out.println("Привет, " + name);
    }

    public static void checkYear(int year){

        if(year % 100 != 0) {
            if (year % 400 == 0) {
                System.out.println(" - високосный год");
            } else if (year % 4 == 0) {
                System.out.println(" - високосный год");
            } else {
                System.out.println(" - не високосный год");
            }
        } else {
            System.out.println(" - не високосный год");
        }
    }
}

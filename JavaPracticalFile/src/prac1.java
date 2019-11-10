/*Wap to implement method overloading*/

public class prac1 {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.println(add(3.5, 6.2));
        System.out.println(add("Nirbhay", " Vashisht"));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

}

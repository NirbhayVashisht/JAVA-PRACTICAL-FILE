/*wap to implement concept of constructor overloading*/
public class prac2 {
    prac2() {
        System.out.println("No Argument Constructor Called");
    }

    prac2(int a, double b) {
        System.out.println("Parameterised Constructor Called with arguments (int,double)");
    }

    prac2(String s){
        System.out.println("Parameterised Constructor Called with argument (String)");
    }

    prac2(String s,double b){
        System.out.println("Parameterised Constructor Called with argument (String,double)");
    }

    public static void main(String[] args) {
        prac2 obj1 = new prac2();
        prac2 obj2 = new prac2(1,2.5);
        prac2 obj3 = new prac2("Nirbhay");
        prac2 obj4 = new prac2("Nirbhay", 9.9);
    }
}

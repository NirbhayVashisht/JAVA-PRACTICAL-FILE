/*wap to implement the concept of inheritance with and without using the super keyword*/
class parent{
    int num = 10;
    public void func(){
        System.out.println("func() of parent");
    }
    parent(int n){
        num = n;
        System.out.println("Constructor of parent");
    }
    parent(){
        System.out.println("Constructor of parent");
    }
}

class child1 extends parent{
    int num = 20;
    public void func(){
        System.out.println("func() of child1");
        super.func();
    }
    child1(int n){
        super(n);
        System.out.println("Constructor of child1");
    }
    public void mymethod(){
        System.out.println("Num in parent : "+super.num);
        System.out.println("Num in child : "+num);
    }
}

class child2 extends parent{
    public void func(){
        System.out.println("func() of child2");
    }
    child2(){
        System.out.println("Constructor of child2");
    }
}

public class prac3 {
    public static void main(String[] args) {
        child1 a = new child1(30);
        a.func();
        a.mymethod();

        System.out.println("---------------------------------------------");

        child2 b = new child2();
        b.func();
    }
}

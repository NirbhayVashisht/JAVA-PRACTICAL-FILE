/*wap to implement concept of interfaces*/
interface mom{
    void mominterfacefunc();
}
interface dad{
    void dadinterfacefunc();
}
interface child extends mom,dad{
    void childinterfacefunc();
}

class family implements child{
    @Override
    public void mominterfacefunc() {
        System.out.println("Defined the mominterfacefunc");
    }

    @Override
    public void dadinterfacefunc() {
        System.out.println("Defined the dadinterfacefunc");
    }

    @Override
    public void childinterfacefunc() {
        System.out.println("Defined the childinterfacefunc");
    }
}

public class prac4  {
    public static void main(String[] args) {
        family obj = new family();
        obj.mominterfacefunc();
        obj.dadinterfacefunc();
        obj.childinterfacefunc();
    }
}

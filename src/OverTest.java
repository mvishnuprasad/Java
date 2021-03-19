public class OverTest {
    public static void main(String[] args) {
        B obj =new B();


    }
}

class A{
    public A() {
        System.out.println("in a");
    }

    public A(int a){
        System.out.println("in a int");
    }

}
class B extends A{
    public B() {
        super(444);
        System.out.println("in b ");
    }

    public B(int a){
        super(a);
    System.out.println("in b int");
}
}

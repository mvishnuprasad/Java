public class Test {
    public static void main(String[] args) {
        sub o=new sub(1,2);
        sub o1=new sub (2,3);
        System.out.println(o.a+" "+o.b);
        System.out.println(o1.a);
    }

}
class sub{
    int a;
    int b;
    public sub(int a, int b){
        this.a=a;
        b=b;
    }
}
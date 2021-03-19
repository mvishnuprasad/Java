public class Mains {
    public static void main(String[] args) {
Houses a=new Houses("!!",0);
        Houses b=new Houses("aaaa",1);
a.print();
b.print();

    }
}
class Houses{
    String name;
    static int KSEB;

    public Houses(String name, int KSEB) {
        this.name = name;
        this.KSEB = KSEB;
    }
    public void print(){
        System.out.println(name+"  "+KSEB);
    }
}
class villa extends Houses{
    int num;
    public villa(int Housenum){

        super("AA",1);
        this.num=Housenum;

    }
}
public class Animal {
    public static void main(String[] args) {
        Animal1 obj=new Animal1("Animal",1,1,5,5);
        Dog dog=new Dog("yol",8,20,2,3,1,22,"Silky");
        dog.eat();
    }
}
class Animal1{
    private  String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal1(String a, int b, int c, int d, int e){
        this.name=a;
        this.brain=b;
        this.body=c;
        this.size=d;
        this.weight=e;
    }w
    public void eat(){
        System.out.println("Animal.eat(Dog eat dog food) called by super");

    }
    public void move(){

    }
    public String getName() {
        return name;
    }
    public int getBrain() {
        return brain;
    }
    public int getBody() {
        return body;
    }
    public int getSize() {
        return size;
    }
    public int getWeight() {
        return weight;
    }
}
class Dog extends Animal1{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name,int size,int weight,int eyes,int legs,int tail,int teeth,String coat){
        super(name,1,1,size,weight);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;


    }
    private void chew(){
        System.out.println("dog chew food");
    }

 @Override
    public void eat() {
        System.out.println("dog.eat in override called");
        chew();
        super.eat();
    }
}
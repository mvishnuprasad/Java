public class House {
    public static void main(String[] args) {
        House1 h=new House1();
        House1 h1= h;

    }
}
class House1{
    String color;


    public String setColor(String color) {
        this.color = color;
        return color;
    }
}
public class House {
    public static void main(String[] args) {
        Dimensions d=new Dimensions(20,20,5);
        Dimensions d1=new Dimensions(19,10,5);
        wall w=new wall("Wood",d);
        wall w1=new wall("Wood",d1);
        Power p=new Power(3,240);
        Power p1=new Power(3,220);
        BedRoom master=new BedRoom("Foam","LED","Cyan","Mica",w,p);
        BedRoom sub=new BedRoom("Coir","CFL","Magenta","Wood",w1,p1);
        Kitchen k=new Kitchen("cng","Aluminium",4,p,w);
        Apartment A25=new Apartment(master,sub,k);
        A25.getRoom1().NailAt(22,23);
        A25.getKit().Cook();


    }
}
class BedRoom{
    private String bed;
    private String Lighting;
    private String paintColor;
    private String FlooringType;
    private wall BedRoomWall;
    private Power BedroomSupply;

    public BedRoom(String bed, String lighting, String paintColor, String flooringType, wall bedRoomWall, Power bedroomSupply) {
        this.bed = bed;
        Lighting = lighting;
        this.paintColor = paintColor;
        FlooringType = flooringType;
        BedRoomWall = bedRoomWall;
        BedroomSupply = bedroomSupply;
    }
    public void NailAt(int x, int y){
        System.out.println("a Photo can be hanged  at "+x+" "+y);
    }

    public String getBed() {
        return bed;
    }

    public String getLighting() {
        return Lighting;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public String getFlooringType() {
        return FlooringType;
    }

    public wall getBedRoomWall() {
        return BedRoomWall;
    }

    public Power getBedroomSupply() {
        return BedroomSupply;
    }
}

class Kitchen{
    private String CookingFuel;
    private String CupBoardMaterial;
    private int DiningSpace;
    private Power KitchenSupply;
    private wall KitchenWall;

    public Kitchen(String cookingFuel, String cupBoardMaterial, int diningSpace, Power kitchenSupply, wall kitchenWall) {
        CookingFuel = cookingFuel;
        CupBoardMaterial = cupBoardMaterial;
        DiningSpace = diningSpace;
        KitchenSupply = kitchenSupply;
        KitchenWall = kitchenWall;
    }
    public void Cook(){
        System.out.println("Cooking a lasagna");
    }
    public String getCookingFuel() {
        return CookingFuel;
    }

    public String getCupBoardMaterial() {
        return CupBoardMaterial;
    }

    public int getDiningSpace() {
        return DiningSpace;
    }

    public Power getKitchenSupply() {
        return KitchenSupply;
    }

    public wall getKitchenWall() {
        return KitchenWall;
    }
}

class wall{
    private String Material;
    private Dimensions Dim;

    public wall(String material, Dimensions Dim) {
        Material = material;
        this.Dim=Dim;
    }


    public String getMaterial() {
        return Material;
    }


    public Dimensions getDim() {
        return Dim;
    }
}
class Dimensions{
    private int length;
    private int depth;
    private int height;

    public Dimensions(int length, int depth, int height) {
        this.length = length;
        this.depth = depth;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }
}

class Power{
    int phase;
    int Voltage;

    public Power(int phase, int voltage) {
        this.phase = phase;
        Voltage = voltage;
    }

    public int getPhase() {
        return phase;
    }

    public int getVoltage() {
        return Voltage;
    }
}
class Apartment{
    private BedRoom Room1;
    private BedRoom Room2;
    private Kitchen kit;

    public Apartment(BedRoom room1, BedRoom room2, Kitchen kit) {

        Room1 = room1;
        Room2 = room2;
        this.kit = kit;
    }

    public BedRoom getRoom1() {
        return Room1;
    }

    public BedRoom getRoom2() {
        return Room2;
    }

    public Kitchen getKit() {
        return kit;
    }
}
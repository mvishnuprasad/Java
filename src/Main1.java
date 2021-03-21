public class Main1 {
    public static void main(String[] args) {
        Dimension d=new Dimension(20,20,5);
        Case theCase= new Case("2222","hp","240",d);
        Resolution r=new Resolution(1280,768);
        Monitor m=new Monitor("27LBB","LG",27, /*r*/ new Resolution(1280,768));
        Motherboard Mb=new Motherboard("XEA22","Asus",6,4,"V20.33");
        PC thePc=new PC(theCase,m,Mb);
      //  thePc.getMonitor().drawPixelAt(1111,1111,"red");
        //thePc.getMotherboard().loadProgramme("Zscaler");
        //thePc.getTheCase().powerButtonPresssed();
        thePc.powerUp();

    }
}

class Motherboard{
    private String model;
    private String manufacturer;
    private int ramslots;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramslots, int cardSlot, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }
    public void loadProgramme(String programneame){
        System.out.println(programneame);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setRamslots(int ramslots) {
        this.ramslots = ramslots;
    }

    public void setCardSlot(int cardSlot) {
        this.cardSlot = cardSlot;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Draw at"+x+" "+y);
    }
}
class Resolution{
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
class Case{
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimension dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimension dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public void powerButtonPresssed(){
        System.out.println("Power button pressed");
    }
}
class Dimension{
    private int width;
    private int height;
    private int depth;

    public Dimension(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
class PC{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp(){
        getTheCase().powerButtonPresssed();
        drawLogo();
    }
private void drawLogo(){
        getMonitor().drawPixelAt(1222,222,"blue");
}
    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}

class Br{
    String name;
    Wall wall1;
    Wall wall2;
    Wall wall3;
    Wall wall4;
    Ceiling ceiling;
    Bed bed;
    Lamp lamp;

    public Br(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }



    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");

    }


}
class Lamp {
    String style;
    boolean battery;
    int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }
    public boolean isBattery(){
        return battery;
    }
}
class Bed{
    String style;
    int pillows;
    int height;
    int sheets;
    int quilt;

    public Bed() {
    }

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public void make(){
        System.out.println("Bed -> Making | ");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
class Ceiling {
    int height;
    int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
class Wall{
    String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
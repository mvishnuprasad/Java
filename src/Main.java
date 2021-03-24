public class Main {
    public static void main(String[] args) {
        Printer p= new Printer(50,true);
        System.out.println("initial pages "+p.getPagesPrinted());
        int pagesPrinted=p.printPages(5);
        System.out.println("Number of pages was "+pagesPrinted+" new count "+p.getPagesPrinted());
        pagesPrinted=p.printPages(201);
        System.out.println("Number of pages was "+pagesPrinted+" new count "+p.getPagesPrinted());
    }
}
class Printer{
    private int TonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (TonerLevel > -1 && TonerLevel <= 100) {
            TonerLevel = tonerLevel;
        } else
            TonerLevel = -1;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }
    public int addToner(int tonerAmount){
        if(TonerLevel>0&&tonerAmount<=100){
            if(this.TonerLevel+tonerAmount>100){
                return -1;
            }

        }

        else {
            return -1;
        }
        this.TonerLevel+=tonerAmount;
        return this.TonerLevel;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex){
            pagesToPrint=(pages/2)+(pages%2);
            System.out.println("printing in duplex");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
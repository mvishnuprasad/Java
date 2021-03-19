import java.util.*;
public class Company {

    public static void main(String[] args) {

        Executives Ex=new Executives("hr", "raHul");
        Executives Ex1=new Executives("Marketing","rose");
        MiddleLevel M= new MiddleLevel("Middlelevel","priya");
        Assosiates A=new Assosiates("Assosiate","robin");
        Ex.setSalary();Ex1.setSalary();
        Ex.setEmpId();Ex1.setEmpId();
        M.setIou();
        A.setLocation();


        System.out.println(Ex.getSalary()+" "+Ex.getName().toLowerCase());
        System.out.println(Ex1.getSalary()+" "+Ex1.getName().toLowerCase());
        System.out.println(M.getIou());
        System.out.println(A.getLocation());
    }
}
class Executives{
    String Position;
    int salary;
    int EmpId;
    String Name;

    public Executives(String position, String N) {
        this.Position=position;
        this.Name=N;
    }


    public String getName() {
        return Name;
    }

    public void setEmpId() {
        if(Name.equalsIgnoreCase("rahul")){
            this.EmpId=1122;
        }
        if(Name.equalsIgnoreCase("priya")){
            this.EmpId=5562;
        }
        if(Name.equalsIgnoreCase("rose")){
            this.EmpId=8585;
        }
        else {
            this.EmpId=0000;
        }
    }

    public int getSalary() {
        // setSalary();
        return salary;
    }
    public void setSalary(){
        if(Position.equalsIgnoreCase("hr")){
            this.salary=30000;
        }
        if(Position.equalsIgnoreCase("marketing")){
            this.salary=35000;
        }
        if(Position.equalsIgnoreCase("product")){
            this.salary=40000;
        }
    }
}


class MiddleLevel extends Executives{
    private String iou;
    public MiddleLevel(String position, String Name) {
        super(position,Name);

    }


    public String getIou() {
        return iou;
    }

    public void setIou() {
        if(Name.equalsIgnoreCase("rahul")){
            this.iou="AWS";
        }
        if(Name.equalsIgnoreCase("rose")){
            this.iou="Azure";
        }
        if(Name.equalsIgnoreCase("Priya")){
            this.iou="GCP";
        }
    }
}
class Assosiates extends Executives{
    private String location;
   // private  String name;
    public Assosiates(String pos, String Name ){
        super(pos,Name);
       // this.name=Name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation() {
        if(Name.equalsIgnoreCase("gita")){
            this.location="Mum";
        }
        if(Name.equalsIgnoreCase("robin")){
            this.location="Chennai";
        }
        if(Name.equalsIgnoreCase("Akhil")){
            this.location="Delhi";
        }
    }
}
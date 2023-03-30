import java.lang.ProcessBuilder.Redirect;

public class P1{
    public static void main(String[] args) {
        Pen p=new Pen();
        System.out.println(p.color);
        p.setColor("Red");
        System.out.println(p.color);
        System.out.println(p.tip);
        p.color="Orange";
        System.out.println(p.color);
    }
}

class Pen{
    String color="Blue";
    int tip=2;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
       tip= newTip;
    }

}
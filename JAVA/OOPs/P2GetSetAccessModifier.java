public class P2GetSetAccessModifier {
    public static void main(String[] args) {
        Pencil p=new Pencil();
        System.out.println(p.getColor());
        p.setColor("Blue");
        System.out.println(p.getColor());

        p.setTip(5);
        System.out.println(p.getTip());
    }
}

class Pencil{
    public String company;
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String color){
        this.color=color;
    }

    void setTip(int tip){
        this.tip=tip;
    }
}
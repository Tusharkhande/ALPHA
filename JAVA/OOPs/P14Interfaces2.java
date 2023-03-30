public class P14Interfaces2 {
    public static void main(String[] args) {
        Sphere s=new Sphere(10);
        s.vol();
        s.display();
    }
}

interface Base{
    void vol();
    void display();
}

class Sphere implements Base{
    float r,vol;
    Sphere(float r){
        this.r=r;
    }
    public void vol(){
        vol=3.14f*r*r*r*4/3;
    }
    public void display(){
        System.out.println(vol);
    }
}


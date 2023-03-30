public class P12AbstractClass {
    public static void main(String[] args) {
        Persian p=new Persian();
        p.purr();
        p.color();
        
        BombayCat b=new BombayCat();
        b.purr();
        b.color();
    }
}

abstract class Cat{
    void purr(){
        System.out.println("Cats Purr");
    }

    abstract void color();
}

class Persian extends Cat{
    void color(){
        System.out.println("White");
    }
}

class BombayCat extends Cat{
    void color(){
        System.out.println("Black");
    }
}

import javax.sql.rowset.spi.SyncResolver;

public class P15MultipleInheritance {
    public static void main(String[] args) {
        Bear ballo=new Bear();
        ballo.herbs();
        ballo.meat();
    }
    
}

interface Herbivore{
    void herbs();
}

interface Carnivore{
    void meat();
}

class Bear implements Herbivore, Carnivore{
    public void herbs(){
        System.out.println("Herbivorous");
    }

    public void meat(){
        System.out.println("Carnivorous");
    }
}

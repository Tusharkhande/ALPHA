public class P13Constructorprecedence {
    public static void main(String[] args) {
        PersianB pb=new PersianB();
        //Cat->Persian->PersianB
    }
}


abstract class Cat{

    Cat(){
        System.out.println("Cat Constructor called");
    }
    void purr(){
        System.out.println("Cats Purr");
    }

    abstract void color();
}

class Persian extends Cat{

    Persian(){
        System.out.println("Persian Constructor Called");
    }
    void color(){
        System.out.println("White");
    }
}

class PersianB extends Persian{
    
    PersianB(){
        System.out.println("PersianB Constructor Called");
    }
    void color(){
        System.out.println("Brown");
    }
}

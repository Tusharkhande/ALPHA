public class P14Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King");
    }
}
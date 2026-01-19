package OOPS_java;

public class Interface {
    public static void main(String[] args) {
        Queen Q1 = new Queen();
        Q1.moves();
    }
    
}

interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer {
    public void moves() {
        System.out.println("up,down,diagonal,left and right");
    }
}

class Rook implements chessPlayer{
    public void moves() {
        System.out.println("up,down,left and right");
    }
}

class king implements chessPlayer{
    public void moves() {
        System.out.println("up,down,diagonal,left and right (By i step only)");
    }
}
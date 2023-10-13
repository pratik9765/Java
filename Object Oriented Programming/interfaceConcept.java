public class interfaceConcept{
    public static void main(String args[]){
        Queen q1 = new Queen();
    }
}

interface ChessPlayer{
    void moves();     //by default moves is abstract and public
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (ina all 4 direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (by 1 step)");
    }
}



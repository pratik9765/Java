public class multipleInheritanceUsingInterface {
    public static void main(String args[]){
        Bear b1 = new Bear();
        b1.carnivoreEat();
        b1.carnivoreEat();
    }
}

interface Carnivor{
    void carnivoreEat();
}

interface Herbivore{
    void herbivoreEat();
}

class Bear implements Carnivor, Herbivore{
    public void carnivoreEat(){
            System.out.println("carnivore eat");
    }

    public void herbivoreEat(){
            System.out.println("herbivore eat");
    }
}


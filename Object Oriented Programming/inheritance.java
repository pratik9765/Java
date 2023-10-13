public class inheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.swim();
    }
}

// class class
class Animal{
    String color;

    void eat(){
        System.out.println("Eating");
    }

    void breathe(){
        System.out.println("breathing");
    }
}


// Derived class      Base class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimming");
    }

}
public class abstraction {
    public static void main(String args[]){
        // Horse h1 = new Horse();
        // h1.eat();
        // h1.walk();

        // Chicken c1 = new Chicken();
        // c1.eat();
        // c1.walk();

        // Animal a1 = new Animal();   // cannot make instance because Animal is a abstract class

        Mustang m1 = new Mustang();
        // Animal -> Horse -> Mustang
         
    }
}


abstract class Animal{
    String color;  

    Animal(){     //we can made constructor of abstract class
        color = "brown";
        System.out.println("Animal constructor called");
    }

    void eat(){
        System.out.println("Eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }

    void setColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Walking");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor is called");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }

    void setColor(){
        color = "dark brown";
    }

    void walk(){
        System.out.println("Chicken is walking");
    }
}

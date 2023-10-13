public class hierarchicalInheritance{
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.eat();
        a1.drink();

        Man m1 = new Man();
        m1.walk();
        m1.eat(); 
    }
}

class Animal{
    void eat(){
        System.out.println("Eating");
    }

    void drink(){
        System.out.println("Drinking");
    }
}

class Man extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swiming");
    }
}
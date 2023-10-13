public class multiLevelInheritance {
    public static void main(String args[]){
        Rohu r1 = new Rohu();
        r1.eat();
        r1.swim();
    }
}

class Animal{
    String name;
    void eat(){
        System.out.println("Eating");
    }

    void drink(){
        System.out.println("Drinking");
    }
}


class Fish extends Animal{
    void swim(){
        System.out.println("Swimming");
    }
}

class Rohu extends Fish{
    void play(){
        System.out.println("Rohu is playing");
    }
}
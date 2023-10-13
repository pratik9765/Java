public class constructor {
    public static void main(String args[]){
        // Person p1 = new Person("Pratik");
        // System.out.println(p1.name);

        Person p1 = new Person();
    }
}

class Person{
    String name;
    int age;

    // Person(String newName){
    //     this.name = newName;
    // }

    Person(){
        System.out.println("Constructor is called");
    }
}

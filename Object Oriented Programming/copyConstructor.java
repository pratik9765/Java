public class copyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name= "Pratik";
        s1.roll = 123;
        s1.password = "Pratik9765";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "Pratik";

        // s2.marks = s1.marks;
        s1.marks[2] = 10;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}


class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    Student(int newRoll){
        marks = new int[3];
        this.roll = newRoll;
    }

    Student(String newName){
        marks = new int[3];
        this.name = newName;
    }

    // Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i] = s1.marks[i];
        }
    }


}
public class staticKeyword {
    
    public static void main(String args[]){
        Student s1 = new Student();
        s1.schoolNmae = "SBVW";
        System.out.println(s1.schoolNmae);

        Student s2 = new Student();
        System.out.println(s2.schoolNmae);

        Student s3 = new Student();
        s3.schoolNmae = "SRVW";
        System.out.println(s3.schoolNmae);


    }
}

class Student{

    static int returnPercentage(int phy,int chem,int math){
        return (phy + math + chem)/3;
    }
    String name;
    int roll;

    static String schoolNmae;

    void setName(String newName){
        this.name = newName;
    }

    String getName(){
        return name;
    }

}

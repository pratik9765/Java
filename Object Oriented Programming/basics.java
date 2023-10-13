public class basics {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}


class Student{
    String name;
    int height;
    float percentage;

    void setName(String newName){
        name = newName;
    }

    void calculatePercentage(int phy,int chem,int math){
        percentage = (phy+chem+math)/3;
    }


}
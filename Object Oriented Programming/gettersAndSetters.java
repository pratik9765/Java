public class gettersAndSetters {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());
    }    
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }

    String getColor(){
        return this.color;
    }

    void setTip(int newtip){
        tip = newtip;
    }

    int getTip(){
        return this.tip;
    }
}

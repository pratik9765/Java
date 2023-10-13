public class methodOverloading {
    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println(calc.sum(10,12));
        System.out.println(calc.sum(10,12,12));
        System.out.println(calc.sum((float)10.3,(float)12.25,(float)10.2));
    }
}


// Function/Method overloading 
class calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b,float c){
        return a+b+c;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}
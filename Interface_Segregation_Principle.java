
package myptis;

public class Interface_Segregation_Principle {
    public static void main(String[] args){
         addition ad = new addition();
         ad.move(5,7);
         
         Subtraction sb = new Subtraction();
         sb.move(15, 5);
         
         Multiplication ml = new Multiplication();
         ml.move(4, 5);
         
         Division dv = new Division();
         dv.move(12, 3);
    }
}

interface Inf_Addition {
    void move(int a,int b);
}

class addition implements Inf_Addition{
    public void move(int a,int b)
    {
        System.out.println("Summation = "+(a+b));
    }
}

interface Inf_Subtraction {
    void move(int a,int b);
}

class Subtraction implements Inf_Subtraction{
    public void move(int a,int b)
    {
        System.out.println("Subtraction = "+(a-b));
    }
}

interface Inf_Multiplication {
    void move(int a,int b);
}

class Multiplication implements Inf_Multiplication{
    public void move(int a,int b)
    {
        System.out.println("Multiplication = "+(a*b));
    }
}

interface Inf_Division {
    void move(int a,int b);
}

class Division implements Inf_Division{
    public void move(int a,int b)
    {
        System.out.println("Division = "+(a/b));
    }
}
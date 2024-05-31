
import java.util.Scanner;

public class StategyDesignPattern
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Discount rate teacher food item : ");
        double discount_food_teacher = sc.nextDouble();
        System.out.print("Discount rate teacher non food item : ");
        double discount_nonfood_teacher = sc.nextDouble();
        
        System.out.print("Discount rate student food item :");
        double discount_food_student = sc.nextDouble();
        System.out.print("Discount rate student non food item :");
        double discount_nonfood_student = sc.nextDouble();
        
        CostStategy cs1 = new TeacherStategy(discount_food_teacher,discount_nonfood_teacher);
        CostStategy cs2 = new StudentStategy(discount_food_student,discount_nonfood_student);
        
        ShoppingCard sc1 = new ShoppingCard(100,200,cs1);
        ShoppingCard sc2 = new ShoppingCard(100,100,cs2);
        
        sc1.print_details();
        sc2.print_details();
    }
}

class CostStategy
{
    double discount_food_item = 0;
    double discount_nonfood_item = 0;
    
    public double Calculate(double food_price,double nonfood_price)
    {
        return 0;
    }
}

class TeacherStategy extends CostStategy
{
    TeacherStategy(double dis_food, double dis_nonfood)
    {
        this.discount_food_item = dis_food;
        this.discount_nonfood_item = dis_nonfood;
    }
    
    @Override
    public double Calculate(double food_price, double nonfood_price)
    {
        return discount_food_item * food_price + discount_nonfood_item * nonfood_price;
    }
}

class StudentStategy extends CostStategy
{
    StudentStategy(double dis_food, double dis_nonfood)
    {
        this.discount_food_item = dis_food;
        this.discount_nonfood_item = dis_nonfood;
    }
    
    @Override
    public double Calculate(double food_price, double non_food_price)
    {
        return food_price * discount_food_item + non_food_price * discount_nonfood_item;
    }
}
class ShoppingCard
{
    double total_price;
    
    public ShoppingCard(double food_price, double non_food_price,CostStategy sc)
    {
        this.total_price = sc.Calculate(food_price,non_food_price);
    }
    
    public void print_details()
    {
        System.out.println("Total price :"+total_price);
    }
}
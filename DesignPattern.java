
package designpattern;
import java.util.Scanner;
public class DesignPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        sc.nextLine();
        String sign = sc.nextLine();
        Factory fp = new Factory();
        if(sign.equals("+")){
            Parent p1 = fp.Perform(num1, num2, sign);
            p1.Operation();
        }
        else {
            Parent p2 = fp.Perform(num1, num2, sign);       
            p2.Operation();
        }
        
    }
}

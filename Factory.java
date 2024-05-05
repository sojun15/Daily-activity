
package designpattern;

public class Factory {
    Parent Perform(int num1,int num2,String str){
        if(str.equals("+")){
            Summation sm = new Summation();
            sm.num1 = num1;
            sm.num2 = num2;
            return sm;
        }
        else {
            Subtraction sb = new Subtraction();
            sb.num1 = num1;
            sb.num2 = num2;
            return sb;
        }
    }
}

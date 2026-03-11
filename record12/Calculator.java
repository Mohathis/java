import java.util.Scanner;
import mathutils.Calcoper;

public class Calculator{
 public static void main(String[] args){
 
 Scanner sc = new Scanner(System.in);
 Calcoper calc = new Calcoper();
 
 System.out.print("Enter first number:");
 int a = sc.nextInt();
 
 System.out.print("Enter second number:");
 int b = sc.nextInt();
 
 System.out.println("Addition:"+calc.add(a,b));
 System.out.println("Substract:"+calc.sub(a,b));
 System.out.println("Multiplication:"+calc.mul(a,b));
 System.out.println("Division:"+calc.div(a,b));
 }
}

//Write a program to divide, multiply, subtract and addition of two numbers
import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] args){
        int num1,num2,result,res2,res3,res4;
        System.out.println("enter two numbers");
        Scanner sc= new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        result = num1+num2;
        res2 = num1-num2;
        res3 = num1*num2;
        res4 = num1/num2;
        System.out.println("the sum of two numbers is "+result +"\nthe difference of two numbers is "+res2 +"\nthe product of two numbers is "+res3+"\nthe quotient of two numbers is "+res4);


    }
}
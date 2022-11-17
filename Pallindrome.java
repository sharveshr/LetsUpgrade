import java.util.Scanner;
public class Pallindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num,numcop,temp,reverse=0;
        System.out.println("enter a number");
        num = sc.nextInt();
        numcop = num;
        while(numcop>0){
            temp = numcop%10;
            numcop = numcop/10;    
            reverse= reverse*10+temp;
        }
        if(reverse == num)
            System.out.println("the number is pallindromic");
        else
            System.out.println("the number is not pallindromic");    
    }
}
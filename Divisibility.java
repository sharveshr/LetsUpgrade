import java.util.Scanner;
public class Divisibility{
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner (System.in);
        num = sc.nextInt();
        if (num%23==0){
            System.out.println("the number is divisible by 23");
        }
        System.out.println("numbers divisible by 23 between 10 and 150");
        for(int i=10;i<=150;i++)
        {
            if(i%23==0)
                System.out.println(i +",");
        }
    } 
}        
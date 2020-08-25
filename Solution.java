import java.util.Scanner;

public class Solution{
    public static void main(String[]args){
       Scanner sin=new Scanner(System.in);
       System.out.println("Enter two integer numbers to add:");
       int x=sin.nextInt();
       int y=sin.nextInt();
       Arithmetic a= new Adder();
       System.out.println("Myrclass is: " + a.getClass().getSuperclass().getName());
       System.out.println(a.add(x,y));


    }
}
package Experiment8;
import java.util.Scanner;
public class Q2 
{
	double quo;
	public void div(int a,int b)
	{
        try{
            quo=a/b;
            System.out.println("Quotient after dividing = "+quo);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can not divide a number by zero");
        }
    }
    public static void main(String args[])
    {
    	int x,y;
        Q2 obj=new Q2();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the First value = ");
        x=sc.nextInt();
        System.out.print("Enter the Second value = ");
        y=sc.nextInt();
        obj.div(x,y);
        sc.close();
    }
    }
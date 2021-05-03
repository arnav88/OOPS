package Experiment5;
import java.util.Scanner;
import Experiment5.ABC;
public class Import_class 
{
	public static void main(String[] args)
	{
		ABC ob=new ABC();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to find the cube:");
		int a=sc.nextInt();
		int c=ob.Cube(a);
		System.out.println("Cube of "+a+" is = "+c);
		sc.close();
		}
	}

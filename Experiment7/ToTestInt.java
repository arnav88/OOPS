package Experiment7;
import java.util.Scanner;
public class ToTestInt extends Arithmetic
{
	public static void main(String args[])
	{
		Arithmetic obj=new Arithmetic();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be squared:");
		int n=sc.nextInt();
		obj.square(n);
		sc.close();
		}
	}

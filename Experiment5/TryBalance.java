package Experiment5;
import java.util.Scanner;
import Balance.Account;
public class TryBalance 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Balance:");
		int bal=sc.nextInt();
		Account ac=new Account();
		ac.display_balance(bal);
		sc.close();
		}
	}

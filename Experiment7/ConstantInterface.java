package Experiment7;

import java.util.Scanner;

public class ConstantInterface implements abc {
	public void VolumeSphere(float r)
	{
		float volume=abc.pi*r*r;
		System.out.println("Volume of Sphere:"+volume);
	}

	public static void main(String[] args) {
		ConstantInterface obj=new ConstantInterface();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of sphere :");
		float r=sc.nextFloat();
		obj.VolumeSphere(r);
		sc.close();
		}
}

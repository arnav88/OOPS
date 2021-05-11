package experiment9;
public class Check 
{
String name;
Check(String s)
{
	name=s;
}
void display()
{
	System.out.println("Name:"+name);
	int c=0,i;
	for(i=0;i<name.length();i++)
		if(name.charAt(i)=='A'||name.charAt(i)=='a')
		{
			c=c+1;
			System.out.println("Number of occurance:"+c);
			System.out.println("Position:"+(i+1));
		}
		if(c==0)
			System.out.println("No 'A' is available in the string,try another");
		}
	}

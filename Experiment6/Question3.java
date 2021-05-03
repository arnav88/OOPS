package Experiment6;
class Worker
{
String name;
int empid;
Worker(int id,String n)
{ 
	empid=id; 
	name=n; 
}
void print()
{

System.out.println("Employee id : "+empid);
System.out.println("Employee name : "+name);
}
}
class dailyworker extends Worker
{
int rate;
dailyworker(int id,String n,int r)
{
super(id,n);
rate=r;
}
void compay(int h)
{
print();
System.out.println("Salary : "+rate*h);
System.out.println(".........................");
}
}
class salariedworker extends Worker
{
int rate;
salariedworker(int id,String n,int r)
{
super(id,n);
rate=r;
}
int hour=40;
void compay()
{
print();
System.out.println("Salary : "+rate*hour);
System.out.println(".........................");
}
}
//--------- main -----------
class Question3
{
public static void main(String args[])
{
salariedworker sw=new salariedworker(500075821,"Axle",1000);
dailyworker dw=new dailyworker(500075273,"Richard",750);
sw.compay();
dw.compay(55);
}}
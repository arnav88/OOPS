package Experiment6;
class Player
{
	int age;
	String name;
Player(String n,int a)
{ 
	name=n; 
	age=a; 
}
void display()
{
System.out.println("Player name : "+name);
System.out.println("Age : "+age);
}
}
class Criket_Player extends Player
{
String type;
Criket_Player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void display()
{
super.display();
System.out.println("Player type : "+type);
System.out.println("\n");
}
}
class Hockey_Player extends Player
{
String type;
Hockey_Player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void display()
{
super.display();
System.out.println("Player type : "+type);
System.out.println("\n");
}
}
class Football_Player extends Player
{
String type;
Football_Player(String n,String t,int a)
{
super(n,a);
type=t;
}
public void display()
{
super.display();
System.out.println("Player type : "+type);
System.out.println("\n");
}
}
// main //
class Question2
{
public static void main(String args[])
{
Criket_Player cric=new Criket_Player("Arnav","Cricket",20);
Hockey_Player hoc=new Hockey_Player("Neeraj","Hockey",22);
Football_Player foot=new Football_Player("Faiz","Football",19);
cric.display();
hoc.display();
foot.display();
}
}
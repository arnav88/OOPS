package Experiment6;
class room
{
private int length,breadth;
room(int x,int y)
{ 
length=x; 
breadth=y;
}
int area()
{
	return(length*breadth);}
}
class bedroom extends room
{
int height;
bedroom(int x,int y,int z)
{
super(x,y);
height=z;
}
int volume()
{
return(area()*height);
}
}
// main //
class Question1
{
public static void main(String args[])
{
bedroom obj=new bedroom(20,30,20);
int a=obj.area();
int v=obj.volume();
System.out.println("Area of Room : "+a+" square metre");
System.out.println("Volume of Room : "+v+" cubic metre");
}
}
import java.util.*;
import java.lang.*;
abstract class shape
{
int x,y;
abstract void printarea(double x,double y);
}
class Rectangle extends shape
{
void printarea(double x,double y)
{
System.out.println("area of rectangle is:"+(x*y));
}
}
class Triangle extends shape
{
void printarea(double x,double y)
{
System.out.println("area of triangle is:"+(0.5*x*y));
}
}
class Circle extends shape
{
void printarea(double x,double y)
{
System.out.println("area of circle is:"+(3.14*x*x));
}
}
public class Abstractrun
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int ch,x,y;
System.out.println("enter 1 for rectangle, 2 for triangle, 3 for circle");
System.out.println("enter your choice");
ch=s.nextInt();
System.out.println("enter the value of x:");
x=s.nextInt();
System.out.println("enter the value of y:");
y=s.nextInt();
Rectangle r=new Rectangle();
Triangle t=new Triangle();
Circle c=new Circle();
switch(ch)
{
case 1:
r.printarea(x,y);
break;
case 2:
t.printarea(x,y);
break;
case 3:
c.printarea(x,y);
break;
default:
System.out.println("wrong choice");
}
}
}



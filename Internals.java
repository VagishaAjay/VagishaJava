package CIE;
import java.util.*;
public class Internals extends Student
{
public int i;
public double imarks[]=new double[5];
public void internal_marks()
{
Scanner s=new Scanner(System.in);
System.out.println("enter student internal marks:");
for(i=0;i<5;i++)
{
imarks[i]=s.nextDouble();
}
}
}


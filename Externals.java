package SEE;
import java.util.*;
import CIE.Student;
public class Externals extends Student
{
public int i;
public double emarks[]=new double[5];
public void external_marks()
{
Scanner ss=new Scanner(System.in);
System.out.println("enter student external marks:");
for(i=0;i<5;i++)
{
emarks[i]=ss.nextDouble();
}
}
}


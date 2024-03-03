import java.util.*;
import CIE.*;
import SEE.*;
public class Main
{
public static void main(String args[])
{
    System.out.println("Bhupendra Singh");
    System.out.println("1BM22CS069");   
int n,i,j;
double total[]=new double[5];
Scanner sss=new Scanner(System.in);
System.out.println("enter number of students:");
n=sss.nextInt();
Student s1[]=new Student[n];
Internals si[]=new Internals[n];
Externals se[]=new Externals[n];
for(i=0;i<n;i++)
{
System.out.println("student details for student"+(i+1)+":");
s1[i]=new Student();
s1[i].student_details();
si[i]=new Internals();
si[i].internal_marks();
se[i]=new Externals();
se[i].external_marks();
s1[i].display();
System.out.println("total marks in 5 courses:");
for(j=0;j<5;j++)
{
total[j]=si[i].imarks[j]+se[i].emarks[j];
}
for(j=0;j<5;j++)
{
System.out.println(total[j]);
}
}
}
}




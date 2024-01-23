import java.util.Scanner;
class Student
{
int usn,i;
String name=new String();
double marks[]=new double[6];
void student_details()
{
System.out.println("enter student details");
Scanner ss1=new Scanner(System.in);
System.out.println("enter student usn");
usn=ss1.nextInt();
System.out.println("enter student name");
name=ss1.next();
System.out.println("enter student marks");
for(i=0;i<6;i++)
{
marks[i]=ss1.nextInt();
}
}
void display()
{
System.out.println("Student name"+name);
System.out.println("USN"+usn);
System.out.println("Student marks");
for(i=0;i<6;i++)
{
System.out.print(marks[i]+" ");
}
}
}
class Run
{
public static void main(String args[])
{
Scanner ss2=new Scanner(System.in);
System.out.println("enter total number of students");
int n=ss2.nextInt();
Student s1[]=new Student[n];
for(int i=0;i<n;i++)
{  
s1[i]=new Student();
s1[i].student_details();
}
System.out.println(n+" \nstudent details:");
for(int i=0;i<n;i++)
{
s1[i].display();
}
}
}


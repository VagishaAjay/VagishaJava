package CIE;
import java.util.*;
public class Student
{
public int usn,sem;
public String name=new String();
public void student_details()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter student details:");
System.out.println("enter student name:");
name=sc.nextLine();
System.out.println("enter student USN:");
usn=sc.nextInt();
System.out.println("enter student semester:");
sem=sc.nextInt();
}
public void display()
{
System.out.println("Student Name:"+name);
System.out.println("Student USN:"+usn);
System.out.println("Student Semester:"+sem);
}
}




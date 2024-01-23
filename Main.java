import java.util.Scanner;
class Books
{
String name,author;
int price,numpages;
Books(){}
Books(String name,String author,int price,int numpages)
{
this.name=name;
this.author=author;
this.price=price;
this.numpages=numpages;
}
public String toString()
{
String name,author,price,numpages;
name="Book name:"+this.name+"\n";
author="Author name:"+this.author+"\n";
price="Price:"+this.price+"\n";
numpages="number of pages:"+this.numpages+"\n";
return name+author+price+numpages;
}
}
class Main
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n,price,numpages,i;
String author,name;
System.out.println("enter the number of books");
n=s.nextInt();
Books b[]=new Books[n];
for(i=0;i<n;i++)
{
System.out.println("Book"+(i+1)+":");
System.out.print("enter name of the book:");
name=s.next();
System.out.print("enter author of the book:");
author=s.next();
System.out.print("enter price of the book:");
price=s.nextInt();
System.out.print("enter number of pages of the book:");
numpages=s.nextInt();
b[i]=new Books(name,author,price,numpages);
}
for(i=0;i<n;i++)
{
System.out.println("Book"+(i+1)+":\n"+b[i]);
}
}
}


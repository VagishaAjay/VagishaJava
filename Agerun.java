import java.util.*;
class WrongAge extends Exception
{
public WrongAge()
{
super("invalid age provided");
}
}

class Father 
{
int fage;
public Father(int fage) throws WrongAge
{
this.fage=fage;
if(fage<0)
{
throw new WrongAge();
}
else
{
System.out.println("the age of father is:"+fage);
}
}
}


class Son extends Father
{
int sage;
public Son(int fage,int sage) throws WrongAge
{
super(fage);
this.sage=sage;
if(sage>=fage)
{
throw new WrongAge();
}
else
{
System.out.println("the age of son is:"+sage);
}
}
}


class Agerun
{
public static void main(String args[])
{
    System.out.println("Vagisha Ajay");
    System.out.println("1BM22CS346");   
Scanner s=new Scanner(System.in);
int fatherage,sonage;
System.out.println("enter the age of father");
fatherage=s.nextInt();
System.out.println("enter the age of son");
sonage=s.nextInt();
try
{
Father f=new Father(fatherage);
Son so=new Son(fatherage,sonage);
}
catch(WrongAge ae)
{
System.out.println("exception caught:"+ae);
}
}
}
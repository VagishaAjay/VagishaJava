import java.util.Scanner
class Quadratic
{
double a,b,c,d,r1,r2;
void calculate()
{
d=b*b-4*a*c;
if(d>0)
{
System.out.println("the roots are real and distinct");
r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
System.out.println("root1="+r1+"and root2="+r2);
}
else if(d==0)
System.out.println("the roots are real and equal");
r1=-b/(2*a);
System.out.println("root1=root2="+r1);
}
else
{
System.out.println("the roots are imaginary");
}
}
}
class Mainrun
{
Scanner s=new Scanner(System.in);
Quadratic obj=new Quadratic();
System.out.println("enter the value of a:");
obj.a=s.nextDouble();
System.out.println("enter the value of b:");
obj.b=s.nextDouble();
System.out.println("enter the value of c:");
obj.c=s.nextDouble();
obj.calculate();
}







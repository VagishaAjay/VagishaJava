class Display implements Runnable
{
String message;
int interval;
public Display(String message,int interval)
{
this.message=message;
this.interval=interval;
}
@Override
public void run()
{
try
{
while(true)
{
System.out.println(message);
Thread.sleep(interval);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}

class DisplayRun
{
public static void main(String args[])
{
    System.out.println("Vagisha Ajay");
    System.out.println("1BM22CS346");   
Thread t1=new Thread(new Display("BMS College of Engineering",10000));
t1.start();
Thread t2=new Thread(new Display("CSE",2000));
t2.start();
}
}

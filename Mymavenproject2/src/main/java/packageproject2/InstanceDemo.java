package packageproject2;

public class InstanceDemo
{
	int a=10,b=2;
public void show(int a,int b)
{
	int c=a*b;
	System.out.println(c);
		
}
public void div()
{
	int c=a/b;
	System.out.println(c);
}
	public static void main(String[] args)
	{
		InstanceDemo obj=new InstanceDemo();
		obj.show(2, 3);
		InstanceDemo obj1=new InstanceDemo();
		obj1.div();
	}

}

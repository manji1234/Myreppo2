package packageproject2;

public class ConstructorDemo2
{
	String s2;int x;int y;
	ConstructorDemo2(String S1,int a,int c)
	{
	s2=S1;
	x=a;
	y=c;
	}
public void show()
{
	System.out.println(s2);
	System.out.println(x);
	System.out.println(y);

}
	public static void main(String[] args)
	{
		ConstructorDemo2 obj=new ConstructorDemo2("Manjima",20,2882);
		obj.show();
		

	}

}

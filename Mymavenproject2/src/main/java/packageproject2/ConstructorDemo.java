package packageproject2;

public class ConstructorDemo
{
	String s2;
	ConstructorDemo(String s1)
	{
s2=s1;
	}
public void show()
{
	System.out.println(s2);
	
}
	public static void main(String[] args) 
	{
		ConstructorDemo obj=new ConstructorDemo("Manjima");
		obj.show();
		
	}

}

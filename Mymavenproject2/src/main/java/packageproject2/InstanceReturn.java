package packageproject2;

public class InstanceReturn
{
public int show(int a,int b)
{
	int c=a-b;
    return c;
}
	public static void main(String[] args)
	{
		InstanceReturn obj=new InstanceReturn();
		System.out.println(obj.show(20,10));

	}

}

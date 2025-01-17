package designpattern;

public class FactoryMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f=new Factory();
		f.getClassInstance("Derived1").print();

	}

}
class Factory
{
	Base getClassInstance(String className)
	{
		if(className.equals("Derived1"))
		{
			return new Derived1();
		}
		else
		{
			return new Derived2();
		}
	}
}
abstract class Base
{
	abstract void print();
	
}
class Derived1 extends Base
{
	void print()
	{
		System.out.println("derived1");
	}
}

class Derived2 extends Base
{
	void print()
	{
		System.out.println("derived2");
	}
}

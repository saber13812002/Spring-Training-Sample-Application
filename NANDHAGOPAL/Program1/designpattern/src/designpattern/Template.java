package designpattern;

public class Template {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseTemplete b1=new DerivedTemplete1();
		b1.template();
		
		BaseTemplete b2=new DerivedTemplete2();
		b2.template();

	}

}

abstract class BaseTemplete
{
	public final void template()
	{
		A();
		B();
	}
	abstract void A();
	abstract void B();
}
class DerivedTemplete1 extends BaseTemplete
{

	@Override
	void A() {
		// TODO Auto-generated method stub
		System.out.println("A in DerivedTemplete1");
		
	}

	@Override
	void B() {
		// TODO Auto-generated method stub
		System.out.println("B in DerivedTemplete1");

		
	}
	
}
class DerivedTemplete2 extends BaseTemplete
{

	@Override
	void A() {
		// TODO Auto-generated method stub
		System.out.println("A in DerivedTemplete2");
		
	}

	@Override
	void B() {
		// TODO Auto-generated method stub
		System.out.println("B in DerivedTemplete2");

		
	}
	
}

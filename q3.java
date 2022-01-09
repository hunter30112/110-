package p1;
interface iArea
{
	void area();
}
class CCircle implements iArea
{
	private double r;
	public CCircle (double r)
	{
		this.r = r;
	}
	public void area() 
	{
		System.out.println("圓形面積: " + 3.1416*r*r);
	}
}
class Rectangle implements iArea
{
	private double w;
	private double h;
	public Rectangle (double w,double h)
	{
		this.w= w;
		this.h= h;
	}
	public void area() 
	{
		System.out.println("長方形面積: " + w*h );
	}
}
class Triangle implements iArea
{
	private double a;
	private double b;
	public Triangle (double a,double b)
	{
		this.a= a;
		this.b= b;
	}
	public void area() 
	{
		System.out.println("三角形面積: " + a*b/2 );
	}
}

public class q3 {

	public static void main(String[] args) {
		iArea a;
		CCircle c = new CCircle(6.0);
		Rectangle r=new Rectangle(10.0, 15.0);
		Triangle t=new Triangle(20.0, 15.0);
		c.area();
		r.area();
		t.area();

	}

}

package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) 
	{
		this.length=length;
		this.width=width;
	}
	
	public double length()
	{
		return length;
	}
	
	public double width()
	{
		return width;
	}
	
	public double area ()
	{
		return this.length*this.width;
	}
	
	public double perimeter ()
	{
		double n = 2*this.length  + 2*this.width;
		return n;
	}
	
	public boolean isSquare ()
	{
		if (this.length==this.width)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller(Rectangle two)
	{
		if (two.area() > this.area())
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle one = new Rectangle(3.0,4.0);
		Rectangle two = new Rectangle (4.0, 5.0);
		System.out.println(one.isSmaller(two));

	}

}

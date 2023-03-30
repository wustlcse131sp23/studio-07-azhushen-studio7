package studio7;

public class Fraction {

	private double numerator;
	private double denominator;
	private float result;

	public Fraction(double numerator, double denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	
	public String add (Fraction two)
	{
		double numAdd = (this.numerator * two.denominator)+ (this.denominator * two.numerator);
		double denAdd = this.denominator * two.denominator;
		String added = numAdd + "/" + denAdd;
		return added;
	}
	
	public String multiply (Fraction two)
	{
		double numMut = this.numerator * two.numerator;
		double denMut= this.denominator * two.denominator;
		String mutliply = numMut + "/" + denMut;
		return mutliply;
	}
	
	public String reciprocal()
	{
		String reci = (int) denominator + "/" + (int) numerator;
		return reci;
	}
	
	
	
	public static void main(String[] args) {
		Fraction one = new Fraction (3,4);
		Fraction two = new Fraction (5,6);
		System.out.println(one.reciprocal());
		System.out.println(one.add(two));
		System.out.println(one.multiply(two));
	}

}

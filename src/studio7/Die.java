package studio7;

public class Die {

	
	private int n;
	
	public Die(int n) {
		this.n= n;
	}
		
	public int integer ()
	{
		return (int) (Math.random()*this.n+1);
	}
	
	public static void main(String[] args) {
		Die sides = new Die(7);
		System.out.print(sides.integer());

	}

}

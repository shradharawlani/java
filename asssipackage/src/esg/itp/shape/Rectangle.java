package esg.itp.shape;

public class Rectangle implements Polygon{
	private  float length,breath,area,peri;
	
	public Rectangle(float length, float breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

	@Override
	public void calculateArea() {
		
		area=length*breath;
	}

	@Override
	public void calculatePeri() {
		peri=2*(length+breath);
		
	}

	@Override
	public void display() {
		System.out.println("Area of Rectangle is:"+area);
		System.out.println("perimeter of Rectangle is:"+peri);
		
		
	}

}

package esg.itp.shape;

public class Square implements Polygon{

private  float side,area,peri;
	
	public Square(float side) {
		super();
		this.side=side;
		
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		area=side*side;
		
	}

	@Override
	public void calculatePeri() {
		// TODO Auto-generated method stub
		peri=4*side;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is:"+area);
		System.out.println("perimeter of Square is:"+peri);

		
	}
	

}

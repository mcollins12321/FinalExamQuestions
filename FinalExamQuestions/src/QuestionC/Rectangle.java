package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() throws illegalRectangle {
		if(Rectangle.newx>0 & Rectangle.newy>0){
		return this.getX() * this.getY();
	}
		else {
			String s = "This is an illegal rectangle.";
			throw new illegalRectangle(s);
		}
			
		}

}

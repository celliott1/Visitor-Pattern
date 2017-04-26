
public class Moonlight implements Visitable{

	private int length;
	
	public Moonlight(int minutes){
		length = minutes;
	}
	
	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}
	
	public int getLength(){
		return length;
	}
}

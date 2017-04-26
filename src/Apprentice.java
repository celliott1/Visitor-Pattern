
public class Apprentice implements Visitable {

private int length;
	
	public Apprentice(int minutes){
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

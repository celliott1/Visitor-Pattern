
public class Logan implements Visitable{

	private int length;
	
	public Logan(int minutes){
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

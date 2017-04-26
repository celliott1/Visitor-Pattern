
public class TestMain {

	public static void main(String[] args){
		
		VisitIterator vi = new VisitIterator();
		
		Logan logan = new Logan(141);
		Moonlight moonlight = new Moonlight(111);
		Xmen xmen = new Xmen(147);
		Life life = new Life(110);
		Apprentice apprentice = new Apprentice(115);
		
		//visitor takes control
		logan.accept(vi);
		moonlight.accept(vi);
		xmen.accept(vi);
		life.accept(vi);
		apprentice.accept(vi);
		
	}
}

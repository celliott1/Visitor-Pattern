
public class VisitIterator implements Visitor{

	@Override
	public int visit(Logan logan) {
	
		System.out.println("Movie length of 'Logan' is: " + logan.getLength() + " minutes \n");
		
		return logan.getLength();
	}

	@Override
	public int visit(Moonlight moonlight) {
		
		System.out.println("Movie length of 'Moonlight' is: " + moonlight.getLength() + " minutes \n");
		
		return moonlight.getLength();
	}

	@Override
	public int visit(Apprentice apprentice) {
		
		System.out.println("Movie length of 'Apprentice' is: " + apprentice.getLength() + " minutes \n");
		
		return apprentice.getLength();
	}

	@Override
	public int visit(Xmen xmen) {
		
		System.out.println("Movie length of 'Xmen' is: " + xmen.getLength() + " minutes \n");
		
		return xmen.getLength();
	}

	@Override
	public int visit(Life life) {
		
		System.out.println("Movie length of 'Life' is: " + life.getLength() + " minutes \n");
	
		return life.getLength();
	}

	
}

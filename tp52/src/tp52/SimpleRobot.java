package tp52;

public class SimpleRobot extends AbstractRobot {

	public SimpleRobot(String nom, int x, int y, Directions direction) {
		super(nom, x, y, direction);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void avance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void droite() {
		// TODO Auto-generated method stub
		switch(direction)
		{
		case Nord: direction = Directions.Est ;
			break;
		case Est: direction = Directions.Sud;
			break;
		case Sud: direction = Directions.Ouest;
			break;
		case Ouest: direction = Directions.Nord;
			break;
		}
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}



}

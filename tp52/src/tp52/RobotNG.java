package tp52;

public class RobotNG extends SimpleRobot {
	protected boolean turbo ;
	public RobotNG(String nom, int x, int y, Directions direction) {
		super(nom, x, y,direction);
		this.turbo=false;
	}
	public boolean turboo()
	{
		return turbo ;
	}
	public void activerTurbo()
	{
		 turbo=true;
	}
	public void desactiveTurbo()
	{
		turbo=false;
	}
	public void avance(int pas)
	{
		if(turbo=true)
			pas=pas*3;
		for(int i=0 ; i<pas;i++)
		{
			avance();
		}
			
	}
	public void gauche() 
	{
		for(int i=0 ; i<3;i++)
			droite();
	}
	public void demiTour()
	{
		droite();
		droite();
	}
	public void afficher()
	{
		super.afficher();
		System.out.println("Le robot est on mode Turbo "+turbo);
	}
	public void avanceDiagonale()
	{
		
	}

}

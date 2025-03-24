package tp52;


public abstract class AbstractRobot implements Movable{
	
	protected String nom ;
	
	protected int x,y;
	
	protected Directions direction ;
	
	public AbstractRobot(String nom, int x, int y, Directions direction) {
		super();
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.direction = Directions.Est;
	}
	public void afficher()
	{
		System.out.println("Le nom de Robot est "+nom);
		System.out.println("ça position "+x+y);
		System.out.println("ça direction "+direction);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getNom() {
		return nom;
	}
	
	
	

}

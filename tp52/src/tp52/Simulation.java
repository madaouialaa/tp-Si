package tp52;

import java.util.Scanner;


public class Simulation {

	

	public void step()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int m = 12;
		AbstractRobot robot;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Entrez le nom de votre robot : ");
			String nom = scanner.nextLine();

			System.out.println("Choisissez le type de robot :");
			System.out.println("1. SimpleRobot");
			System.out.println("2. RobotNG (nouvelle génération)");
			System.out.print("Votre choix : ");
			int typeRobot = scanner.nextInt();
			
			boolean isNG = false;

			if (typeRobot == 2) {
			    robot = new RobotNG(nom, 0, 0, Directions.Est);
			    isNG = true;
			} else {
			    robot = new SimpleRobot(nom, 0, 0,Directions.Est);
			}
			boolean running = true;
 while (running) {
			 System.out.println("\n=== MENU ===");
			 System.out.println("1. Avancer");
			 System.out.println("2. Tourner à droite");
			 if (isNG) {
			     System.out.println("3. Tourner à gauche");
			     System.out.println("4. Demi-tour");
			     System.out.println("5. Activer/Désactiver Turbo");
			 }
			 System.out.println("6. Afficher l'état du robot");
			 System.out.println("7. Quitter");
			 System.out.print("Votre choix : ");

			 int choix = scanner.nextInt();

			 switch (choix) {
			     case 1:
			         System.out.print("Combien de pas ? ");
			         int pas = scanner.nextInt();
			         if (isNG) {
			             ((RobotNG) robot).avance(pas);
			         } else {
			             for (int i = 0; i < pas; i++) {
			                 robot.avance();
			             }
			         }
			         break;

			     case 2:
			         robot.droite();
			         break;

			     case 3:
			         if (isNG) {
			             ((RobotNG) robot).gauche();
			         } else {
			             System.out.println("Option non disponible pour SimpleRobot.");
			         }
			         break;

			     case 4:
			         if (isNG) {
			             ((RobotNG) robot).demiTour();
			         } else {
			             System.out.println("Option non disponible pour SimpleRobot.");
			         }
			         break;

			     case 5:
			         if (isNG) {
			             RobotNG ngRobot = (RobotNG) robot;
			             if (ngRobot.turboo()) {
			                 ngRobot.desactiveTurbo();
			                 System.out.println("Mode Turbo désactivé.");
			             } else {
			                 ngRobot.activerTurbo();
			                 System.out.println("Mode Turbo activé !");
			             }
			         } else {
			             System.out.println("Option non disponible pour SimpleRobot.");
			         }
			         break;

			     case 6:
			         robot.afficher();
			         break;

			     case 7:
			         running = false;
			         System.out.println("Fin de la simulation. À bientôt !");
			         break;

			     default:
			         System.out.println("Choix invalide. Essayez encore.");
			 }
 }
 
      
		}
		DrawClass.drawBoard(n, m,robot);
		
		
		
		
		
	}
}

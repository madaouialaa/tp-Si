package tp52;

public class DrawClass {
		
		public  static final  void drawBoard(int rows, int columns,AbstractRobot robot) {
			
			char[][] board = initBoard(rows, columns);
			
			if(robot.getY() >=0 && robot.getY() < rows && robot.getX() >=0 && robot.getX() < columns)
			{
				board[robot.getY()][robot.getX()] = robot.getNom().charAt(0);
			}else {
				System.out.println("Erreur : Le robot est hors des limites ");
			}
			
			
			
			
			// Print the board with row and column separators
			for (int i = 0; i < rows; i++) {
				System.out.print("+");
				for (int j = 0; j < columns * 4 ; j++)
					if(j%4 == 3)
						System.out.print("+");
					else
						System.out.print("-"); // Horizontal line for each row
				System.out.println();
				System.out.print("|");
				for (int j = 0; j < columns; j++) {
					System.out.print(" " + board[i][j] + " |"); // Print cell with separators
				}
				System.out.println();
			}
			System.out.print("+");
			for (int j = 0; j < columns * 4 ; j++)
				if(j%4 == 3)
					System.out.print("+");
				else
					System.out.print("-"); // Horizontal line for each row
			System.out.println(); // Final horizontal line
			System.out.println();
			System.out.println();
		}

		private static char[][] initBoard(int rows, int columns) {
			// TODO Auto-generated method stub
			char[][] board = new char[rows][columns]; 
			for(int i = 0 ; i < rows; i ++)
				for (int j = 0; j < columns; j++) 
					board[i][j]=' ';
					
			return board;
		}
		
		
		
	}



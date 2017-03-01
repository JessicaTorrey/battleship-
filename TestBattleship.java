import java.util.Scanner;

public class TestBattleship{
  public static void main (String[] args){
      Player player = new Player(false);

      Battleship board = new Battleship();
    
      System.out.println(player);
      board.printBoard();
    
      int x1 = player.getShips().getx1(); 
      int y1 = player.getShips().gety1();
      int x2 = player.getShips().getx2();
      int y2 = player.getShips().gety2();
    //you said it was ok not to compile
    
      /*
        Make GamePlay:
        1) Allow for Player to input x and y values which will be marked with 'x' to signify a ship.
        a) enter x1,y1,x2,y2 values
        2) Using if else; if value/char is equal to the opponents x1,y1,x2,y2 then print "you hit" (and removed value)
            else return "you missed"
        3) Using if else; if value/char is equal to the x1,y1,x2,y2 (equal to all of these) print "you sunk the ship"
          else return "you missed" */
    
    board.placeShip(x1, y2);
    board.placeShip(x2, y2);
    board.printBoard();
    
    //test game logic
    Scanner input = new Scanner(System.in);
    
    System.out.println("Guess where the ship is! Enter x-location: ");
    x1 = input.nextInt();
    System.out.println("Enter y-location: ");
    y1 = input.nextInt();
    
    if(x1 == player.getShips().getx1() && y1 == player.getShips().gety1()){
      System.out.println("You sunk the ship!");
    }
    else{
      System.out.println("You missed!");
    }
    
    
    }
  
}
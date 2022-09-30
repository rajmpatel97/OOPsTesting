interface Movable {  
   public void moveUp();  
   public void moveDown();
   public void moveLeft();
   public void moveRight();
}

class MovablePoint implements Movable {
	   
	   private int x, y;   
	      
	  
	   public MovablePoint(int x, int y) {
	      this.x = x;
	      this.y = y;
	   }

	
	   public String toString() {
	      return "(" + x + "," + y + ")";
	   }

	   public void moveUp() {
	      y--;
	   }
	  
	   public void moveDown() {
	      y++;
	   }
	   
	   public void moveLeft() {
	      x--;
	   }
	  
	   public void moveRight() {
	      x++;
	   }
	}
public class CursorMove {
	public static void main(String[] args) {
	      MovablePoint p1 = new MovablePoint(1, 2);
	      System.out.println(p1);
	    
	      p1.moveDown();
	      System.out.println(p1);
	    
	      p1.moveRight();
	      System.out.println(p1);
	    
	      Movable p2 = new MovablePoint(3, 4); 
	      p2.moveUp();
	      System.out.println(p2);
	     

	      MovablePoint p3 = (MovablePoint)p2; 
	      System.out.println(p3);
	    
	   }
	}

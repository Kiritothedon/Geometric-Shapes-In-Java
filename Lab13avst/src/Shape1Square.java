// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
	public Shape1Square(){
		
	}
   public void drawShape(Graphics g)
   {
	   
	   g.fillRect(60, 60, 150, 150);
	   ;
   }
   public void displayName(Graphics g)
   {
	g.drawString("Square", 15, 100);   
   }
   
   public void displayNumSides(Graphics g) {
	   g.drawString("A Square Has Four Sides", 70, 230);
   }
}

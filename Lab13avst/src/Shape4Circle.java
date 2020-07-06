// Shape4Circle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape4Circle implements Shape
{
   public void drawShape(Graphics g)
   {
	   g.fillOval(530, 380, 150, 150);
   }   
   public void displayName(Graphics g)
   {
	g.drawString("Circle", 430, 400);   
   }
   public void displayNumSides(Graphics g) {
	   g.drawString("A Circle Has Sides", 550, 580);
   }
}
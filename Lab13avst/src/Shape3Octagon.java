// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
	public Shape3Octagon() {
		//Just cause
	}
   public void drawShape(Graphics g)
   {
	   /*
	   g.drawLine(100, 500, 200, 500);//500 500
	   g.drawLine(100, 500, 60, 450);//500 450
	   g.drawLine(200, 500, 260, 450);//500 450
	   g.drawLine(260, 450, 260, 400);//450 400
	   g.drawLine(60, 450, 60, 400);//450 400
	   g.drawLine(260, 400, 220, 350);//400 350
	   g.drawLine(220, 350, 120, 350);//350 350
	   g.drawLine(120, 350, 60, 400); // 350 400
	   */
	   int []xPoints = {100,200,100,60,200,260,260,260,60,60,260,220,220,120,120,60};
	   int []yPoints = {500 ,500 ,500 ,450 ,500 ,450 ,450 ,400 ,450 ,400 ,400 ,350 ,350 ,350 ,350 ,400};
	   int nPoints = 16;
	   g.drawPolygon(xPoints, yPoints, nPoints);
	   g.fillPolygon(xPoints, yPoints, nPoints);
   }
   public void displayName(Graphics g)
   {
	g.drawString("Octagon", 15, 400);   
   }
   public void displayNumSides(Graphics g) {
	   g.drawString("An Octagon has Eight Sides", 90, 550);
   }
}

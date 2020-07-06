// Lab14avst.java
// Lab14a
// Student starting version


import java.awt.*;
import java.applet.*;
import java.util.ArrayList;


public class Lab14avst extends Applet
{
 public void paint(Graphics g)
 {
  ArrayList<Shape> shapes = new ArrayList<Shape>();
  Shape1Square Square = new Shape1Square();
  Shape2Triangle Triangle = new Shape2Triangle();
  Shape3Octagon Octagon = new Shape3Octagon();
  Shape4Circle Circle = new Shape4Circle();
  
  
  shapes.add(Square);
  shapes.add(Triangle);
  shapes.add(Octagon);//It looks stupid but it works
  shapes.add(Circle);
  
  drawGrid(g);
  
  for(Shape shape: shapes){
	  shape.drawShape(g);
	  shape.displayName(g);
	  shape.displayNumSides(g);
	  }
  
 }

public void drawGrid(Graphics g)
 {
  g.drawRect(10,10,800,600);
  g.drawLine(10,300,810,300);
  g.drawLine(410,10,410,610);
 }
}

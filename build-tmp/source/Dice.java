import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(400, 400);
	noLoop();
}
public void draw()
{
	//your code here
	background(25);
	Die firstDie = new Die(50, 50);
	firstDie.show();

}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	//constructor
	int rectX, rectY;
	Die(int x, int y) {
		//variable initializations here
		rectX = x;
		rectY = y;

	}
	public void roll()
	{
		//your code here

	}
	public void show()
	{
		//your code here
		rect(rectX, rectY, 50, 50);
		fill(0);
		strokeWeight(6);
		point(rectX + 25, rectY + 25);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

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

Die firstDie;
int count;
float vA;
float vB;
float vC;
public void setup()
{
	size(400, 400);
	//background(25);
	noLoop();


}
public void draw()
{
	//your code here

	firstDie = new Die(25, 25, 25);
	firstDie.show();

}
public void mousePressed()
{
	redraw();
	firstDie.roll();
	firstDie.show();
}
class Die //models one single dice cube
{
	//variable declarations here
	//constructor
	int rectX, rectY, rectS;
	Die(int x, int y, int s) {
		//variable initializations here
		rectX = x;
		rectY = y;
		rectS = s;

	}
	public void roll()
	{
		//your code here
		count = (int)(Math.random()*6) + 1;

		

	}
	public void show()
	{
		//your code here
		rect(rectX, rectY, rectS, rectS);
		fill(0);
		strokeWeight(5* (rectS/25));
		vA = rectX*0.25f;
		vB = rectY*0.75f;
		vC = rectX*0.5f;
		if(count == 1) {
			point(rectS + vC , rectS + vC);
		}
		if (count == 2) {
			point(rectS + vB, rectS + vA);
			point(rectS + vA, rectS + vB);
		}

		if (count == 3) {
			point(rectS + vC, rectS + vC);
			point(rectS + vB, rectS + vA);
			point(rectS + vA, rectS + vB);
		}
		if (count == 4) {
			point(rectS + vB, rectS + vA);
			point(rectS + vA, rectS + vB);
			point(rectS + vA, rectS + vA);
			point(rectS + vB, rectS + vB);
		}
		if (count == 5){
			point(rectS + vC, rectS + vC);
			point(rectS + vB, rectS + vA);
			point(rectS + vA, rectS + vB);
			point(rectS + vA, rectS + vA);
			point(rectS + vB, rectS + vB);
		}
		if (count == 6) {
			point(rectS + vB, rectS + vA);
			point(rectS + vA, rectS + vB);
			point(rectS + vA, rectS + vA);
			point(rectS + vB, rectS + vB);
			point(rectS + vA, rectS + vC);
			point(rectS + vB, rectS + vC);
		}
		strokeWeight(1);
		fill(255);
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

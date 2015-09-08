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


int count;
float vA;
float vB;
float vC;
public void setup()
{
	size(400, 400);
	background(25, 125, 75);
	noLoop();


}
public void draw()
{
	//your code here
	for(int i = 0; i < 100; i+= 30 ) {
	Die firstDie;
	firstDie = new Die(i, i, 25);
	firstDie.show();
	}
	

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
		vA = rectS*0.25f;
		vB = rectS*0.75f;
		vC = rectS*0.5f;
		if(count == 1) {
			point(rectX + vC , rectY + vC);
		}
		if (count == 2) {
			point(rectX + vB, rectY + vA);
			point(rectX + vA, rectY + vB);
		}

		if (count == 3) {
			point(rectX + vC, rectY + vC);
			point(rectX + vB, rectY + vA);
			point(rectX + vA, rectY + vB);
		}
		if (count == 4) {
			point(rectX + vB, rectY + vA);
			point(rectX + vA, rectY + vB);
			point(rectX + vA, rectY + vA);
			point(rectX + vB, rectY + vB);
		}
		if (count == 5){
			point(rectX + vC, rectY + vC);
			point(rectX + vB, rectY + vA);
			point(rectX + vA, rectY + vB);
			point(rectX + vA, rectY + vA);
			point(rectX + vB, rectY + vB);
		}
		if (count == 6) {
			point(rectX + vB, rectY + vA);
			point(rectX + vA, rectY + vB);
			point(rectX + vA, rectY + vA);
			point(rectX + vB, rectY + vB);
			point(rectX + vA, rectY + vC);
			point(rectX + vB, rectY + vC);
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

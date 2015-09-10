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
Die firstDie;
float vA;
float vB;
float vC;
int tally;
public void setup()
{
	size(405, 420);
	noLoop();

}
public void draw()
{
	//your code here
	background(25, 125, 75);
	text("Total Count: " + tally, 202.5f, 415);
	tally = 0;
	for (int j = 10; j <= 390; j += 30) {
		
		for(int i = 10; i <= 390; i+= 30 ) {

			firstDie = new Die(i, j, 25);
			firstDie.roll();
			firstDie.show();
			tally += count;

		
	}
	}

	
	

}
public void mousePressed()
{
	redraw();

	
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
		stroke(0);
		fill(rectS+50, rectX-30, rectY-30);
		rect(rectX, rectY, rectS, rectS);
		
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

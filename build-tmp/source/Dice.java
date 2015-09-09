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
public void setup()
{
	size(405, 420);
	background(25, 125, 75);

}
public void draw()
{
		//your code here
		
	for (int j = 10; j <= 390; j += 30) {
		
		for(int i = 10; i <= 390; i+= 30 ) {
			

			firstDie = new Die(i, j, 25);
			
			if (mousePressed == true) {
			for ( int k  = 0; k <6; k++) {
			firstDie.roll();
			firstDie.show();
		}
		}
		
		
	}
	}

	
	

}
public void mousePressed()
{
	
	

	
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

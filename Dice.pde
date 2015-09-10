
int count;
Die firstDie;
float vA;
float vB;
float vC;
int tally;
void setup()
{
	size(405, 420);
	noLoop();

}
void draw()
{
	//your code here
	background(25, 125, 75);
	text("Total Count: " + tally, 202.5, 415);
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
void mousePressed()
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
	void roll()
	{
		//your code here

		count = (int)(Math.random()*6) + 1;

		

	}
	void show()
	{
		//your code here
		stroke(0);
		fill(rectS+50, rectX-30, rectY-30);
		rect(rectX, rectY, rectS, rectS);
		
		strokeWeight(5* (rectS/25));
		vA = rectS*0.25;
		vB = rectS*0.75;
		vC = rectS*0.5;
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


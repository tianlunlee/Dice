void setup()
{
	size(400, 400);
	noLoop();
}
void draw()
{
	//your code here
	background(25);
	Die firstDie = new Die(50, 50);
	firstDie.show();

}
void mousePressed()
{
	redraw();
	count = (int)(Math.random()*6) + 1;
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
	void roll()
	{

		//your code here
		

	}
	void show()
	{
		//your code here
		rect(rectX, rectY, 50, 50);
		fill(0);
		strokeWeight(6);
		point(rectX + 25, rectY + 25);
	}
}

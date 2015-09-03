void setup()
{
	size(400, 400);
	noLoop();
}
void draw()
{
	//your code here
	background(25);
	Die firstDie(50, 50);
	firstDie.show();

}
void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	//variable declarations here
	Die(int x, int y) //constructor
	{
		//variable initializations here
		int x = x;
		int y = y;


	}
	void roll()
	{
		//your code here
	}
	void show()
	{
		//your code here
		rect(x, y, 50, 50);
		fill(0);
		strokeWeight(30);
		point(x + 25, y + 25);
		
	}
}

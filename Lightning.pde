
int startX=250;
int startY=0;
int endX=250;
int endY=0;

void setup()
{
  size(500,500);
  background(0,0,0);
  strokeWeight(2);
  frameRate(5);
}

void draw()
{
	clear();
int startY=0;
int endX=250;
int endY=0;
	int startX=250+(int)(Math.random()*512-256);
	int r=(int)(Math.random()*100+200);
	int g=(int)(Math.random()*100+200);
	int b=(int)(Math.random()*150);
		stroke (r,g,b);
	while (endX<500)
	{
		int changeX=(int)(Math.random()*19-9);
		int changeY=(int)(Math.random()*10);
		endX=startX+changeX;
		endY=startY+changeY;
			line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
}

void mousePressed()
{
clear();
startX=250;
startY=0;
endX=250;
endY=0;
}


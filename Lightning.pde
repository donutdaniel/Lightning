
int startX=250;
int startY=0;
int endX=250;
int endY=0;

void setup()
{
  size(500,500);
  background(0,0,0);
  strokeWeight(2);
  frameRate(60);
}

void draw()
{
clouds();
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

void clouds() {
	noStroke();
  fill(153);
 ellipse(0,0,150,100);
 ellipse(150,0,200,120);
 ellipse(260,0,150,100);
 ellipse(300,0,130,110);
 ellipse(400,0,100,120);
 ellipse(500,0,160,134);
}

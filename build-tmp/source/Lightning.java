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

public class Lightning extends PApplet {


int startX=250;
int startY=0;
int endX=250;
int endY=0;

public void setup()
{
	clouds();
  size(500,500);
  background(0,0,0);
  strokeWeight(2);
  clouds();
}

public void draw()
{
//clouds();
	int startX=250+(int)(Math.random()*512-256);
	int r=(int)(Math.random()*100+200);
	int g=(int)(Math.random()*100+200);
	int b=(int)(Math.random()*150);
		//stroke (r,g,b);
	while (endX<500)
	{
		stroke (r,g,b);
		int changeX=(int)(Math.random()*19-9);
		int changeY=(int)(Math.random()*10);
		endX=startX+changeX;
		endY=startY+changeY;
			line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
}

public void mousePressed()
{
clear();
startX=250;
startY=0;
endX=250;
endY=0;
}

public void clouds() {
	noStroke();
  fill(153);
 ellipse(0,0,150,100);
 ellipse(150,0,200,120);
 ellipse(260,0,150,100);
 ellipse(300,0,130,110);
 ellipse(400,0,100,120);
 ellipse(500,0,160,134);




}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

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
  size(500,500);
  background(0,0,0);
  strokeWeight(2);
}

public void draw()
{
	clear();
int startX=250+(int)(Math.random()*512-256);
int startY=0;
int endX=250;
int endY=0;
	int r=(int)(Math.random()*256);
	int g=(int)(Math.random()*256);
	int b=(int)(Math.random()*256);
		stroke (r,g,b);
	while (endX<500)
	{
		endX=startX+(int)(Math.random()*19-9);
		endY=startY+(int)(Math.random()*10);
			line(startX,startY,endX,endY);
		startX=endX;
		startY=endY;
	}
}

public void mousePressed()
{
startX=250;
startY=0;
endX=250;
endY=0;
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

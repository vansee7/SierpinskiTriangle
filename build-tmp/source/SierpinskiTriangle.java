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

public class SierpinskiTriangle extends PApplet {

public void setup()
{
	size(500, 500);
	background(0);
}

public void draw()
{
	sierpinski(50, 450, 400);
}

public void mouseClicked()
{
	int yello = (int)(Math.random()*255);
	int jello = (int)(Math.random()*255);
	int hello = (int)(Math.random()*255);
	fill(yello, jello, hello);
	sierpinski((int)(Math.random()*400), (int)(Math.random()*500), 400);
}

public void sierpinski(int x, int y, int len) 
{
	if(len > 5){
		sierpinski(x, y, len/2);
		sierpinski(x+len/2, y, len/2);
		sierpinski(x+len/4, y-len/2, len/2);
	}
	else 
		triangle(x, y, x+len, y, x+len/2, y-len/2);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

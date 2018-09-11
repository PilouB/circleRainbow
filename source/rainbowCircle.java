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

public class rainbowCircle extends PApplet {

public void setup()
{
  
  background(0);
  colorMode(HSB);
}

int cx = 1;
int cy = 1;
int r = 150;
int colorR = 0;
int colorP = 360;
int y;
int x;
float t;

public void draw()
{
  t = millis()/700.0f;
  x = (int)(cx+r*cos(t));
  y = (int)(cy+r*sin(t));
  
  noFill();
  ellipseMode(CENTER);
  translate(width/2, height/2);
  strokeWeight(2);
  stroke(colorR, 255, 255);
  if(colorR > 360) colorR = 0;
  else colorR++;
  ellipse(x, y, 100, 100);
  
}
  public void settings() {  size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "rainbowCircle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

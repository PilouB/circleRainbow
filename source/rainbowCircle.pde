void setup()
{
  size(500, 500);
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

void draw()
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

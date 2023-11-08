class Stripes
{
  float x, y;
  int stripLength;
  int moveSpeed;


  Stripes(float x, int stripLength, int moveSpeed)
  {
    this.moveSpeed = moveSpeed;
    this.x = x;
    this.y = 0;
    this.stripLength = stripLength;
    this.moveSpeed = moveSpeed;
  }

  void display()
  {
    fill(0);
    stroke(0);
    strokeWeight(10);
    line(x, y, x, y + stripLength);
  }
  void move()
  {
    y += moveSpeed;

    if (y>height)
    {
      y= -stripLength;
    }
  }
}

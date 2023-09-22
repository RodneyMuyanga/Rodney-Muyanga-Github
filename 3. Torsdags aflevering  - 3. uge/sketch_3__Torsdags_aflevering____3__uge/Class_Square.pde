
class Square
{

  float Xposition;
  float Yposition;

  Square(float xPos, float yPos)
  {
    this.Xposition = xPos;
    this.Yposition = yPos;
  }

  void display()
  {
    rectMode(CENTER);
    rect(Xposition, Yposition, 50, 50);
  }
}

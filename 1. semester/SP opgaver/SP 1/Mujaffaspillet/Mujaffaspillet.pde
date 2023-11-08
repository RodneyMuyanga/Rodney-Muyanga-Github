Road road;
Car carDrive;
Stripes[] roadStripes;

void setup() {
  size(1600, 1000);
  smooth();
  frameRate(50);
  
  
  
  
  roadStripes = new Stripes[10];
  road = new Road();
  carDrive = new Car();
  for (int i = 0; i < roadStripes.length; i++) 
  {
    roadStripes[i] = new Stripes(width / 2, 70, 10);
  }
}

void draw() 

{
  fill(0);
  background(255);
  for (Stripes stripe : roadStripes) {
    stripe.display();
    stripe.move();
    road.road();
    carDrive.carDrive();
  }
}

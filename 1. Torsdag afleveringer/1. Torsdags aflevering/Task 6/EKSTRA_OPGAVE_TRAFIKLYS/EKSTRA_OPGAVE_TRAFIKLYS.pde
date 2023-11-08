//Task 6 (FRIVILLIG)
/*Du skal tegne et traffiklys der skifter på samme måde som et rigtigt traffiklys.
 Du kan gøre det på mange måder, men her kommer en opskrift hvor du skal erklære et sæt variable til
 at holde nogle bestemte farver og andet sæt variable der kan
 skifte mellem at være associeret med hver af de farver.
 På den måde kan du lade selve fill kommandoen være uændret selvom du ændrer farven.*/

/*6.a Declare and initialize variables to store the colors of a traffic light
 (red, yellow, green). Dont forget a color for when the lights are off.*/


color red = color(255, 0, 0);
color yellow = color(255, 255, 0);
color green = color(0, 0, 255);
color black = color(0, 0, 0);
color gry = color(50);
int framecount = 0;

void setup() {
  size (1800, 1600);
  background (255);
  frameRate (20);
  smooth ();
}
/*6.b Declare and initialize variables to store which
 color each of the lights are at a given moment in time.*/

void draw() {


  rectMode(CENTER);
  stroke(black);
  fill(gry);
  rect(900, 400, 200, 600);
  stroke(black);
  fill(black);

  
  ellipse(900, 600, 200, 200);

  if (frameCount <= 20) {
    print(frameCount);
    fill(red);
    // ellipese: 1
    ellipse(900, 200, 200, 200);
  
} else if  (frameCount >= 20 ) {
      print(frameCount);
      fill(yellow);
      // ellipse: 2
      ellipse(900, 400, 200, 200);
      
} else if  (frameCount <= 20) {
      print(frameCount);
      fill(green);
      // ellipse: 3
      ellipse(900, 600, 200, 200);
      
   }
 }

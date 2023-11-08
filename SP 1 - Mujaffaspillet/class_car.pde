class Car
{
  void carEdge()
  {
    if (mouseX < 350)
    {
      mouseX = 350;
    } else if (mouseX > 1250) {
      mouseX = 1250;
    }
  }

  void carDrive()
  {
    carEdge();

    //Karrosseri
    stroke(0);
    strokeWeight(3);
    fill(255, 50, 200);
    rectMode(CENTER);
    rect(mouseX, mouseY, 200, 350, 5); //bruge "built in variables.
    strokeWeight(2);
    fill(50);

    //Kofanger
    rect(mouseX, mouseY-180, 210, 10, 2);
    rect(mouseX, mouseY+180, 210, 10, 2);

    //Vinduer
    fill(100);
    rect(mouseX, mouseY+80, 120, 40, 5);
    fill(230);
    rect(mouseX, mouseY-80, 130, 70, 5);

    //DÆK
    fill(35);
    rect(mouseX-110, mouseY-100, 20, 70, 5); //Højre forhjul
    rect(mouseX+110, mouseY-100, 20, 70, 5); //Venstre forhjul
    rect(mouseX-115, mouseY+100, 30, 70, 5); //Venstre baghjul
    rect(mouseX+115, mouseY+100, 30, 70, 5); //Højre baghjul

    //bagLygter
    fill(255, 165, 0);
    rect(mouseX-65, mouseY+150, 50, 30, 10);
    rect(mouseX+65, mouseY+150, 50, 30, 10);
    //røde
    fill(230, 0, 0);
    rect(mouseX-60, mouseY+150, 40, 30, 10);
    rect(mouseX+60, mouseY+150, 40, 30, 10);

    //forLygter
    fill(200);
    ellipse(mouseX-70, mouseY-150, 30, 20);
    ellipse(mouseX+70, mouseY-150, 30, 20);

    //udStødning
    fill(100);
    rect(mouseX-50, mouseY+200, 20, 30, 5);
    rect(mouseX+50, mouseY+200, 20, 30, 5);
    //Dobbelt venstre
    rect(mouseX-70, mouseY+200, 20, 30, 5);
    rect(mouseX+70, mouseY+200, 20, 30, 5);

    //Antenne
    strokeWeight(5);
    line(mouseX, mouseY, mouseX, mouseY+50);
  }
}

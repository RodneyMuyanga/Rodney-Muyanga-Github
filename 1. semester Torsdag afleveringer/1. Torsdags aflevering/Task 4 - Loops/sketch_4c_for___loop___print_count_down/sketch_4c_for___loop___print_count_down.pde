/*4.c 
alter the loop so that it becomes a 
countdown starting at the value you give to a variable
of type int called start. 
When it reaches 0, print "Take Off!"*/

int countdown = 20;

 while(countdown > 0) { /* Jeg fortæller computeren at imens vores variabel er større end 0,
 så skal du printe countdown + huske at vores variabel, som starter på værdien 20*/
    println("countdown: " + countdown);
    countdown = countdown -1;
  } // når du har husket det, så skal du huske at variablen har værdien 20, men du skal trække -1 fra.
 if (countdown == 0){ // når vores variabel rammer 0, skal du skrive "Take Off".
  println ("Take off!");
}

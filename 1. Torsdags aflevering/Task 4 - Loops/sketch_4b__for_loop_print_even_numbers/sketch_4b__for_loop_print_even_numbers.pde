//TASK 4 
/*Her skal du øve dig i at skrive for-loops og while-loops (og måske en switch-case)*/

//4.b alter the for-loop from 4.a to only print even numbers.

for(int i = 0; i < 21; i ++){
  if(i % 2 == 0){
  println ("Tæller til: " + i);
  }  
}
//if(i % 2 == 0);{ = fejl. (Semikolon er vigtigt ikke at have med)!!!! 

/*Din kode har et lille fejl, der forhindrer den i at kun udskrive lige tal. 
Problemet er det semikolon, der følger efter if(i % 2 == 0). 
Semikolon fungerer som en tom erklæring, så det betyder, 
at blokken i parenteserne {} efter if altid bliver udført, uanset om betingelsen er sand eller falsk.*/

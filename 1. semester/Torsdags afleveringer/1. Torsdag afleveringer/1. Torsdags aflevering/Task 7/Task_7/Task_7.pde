/*
    7.a create an integer(int) called input and assign it a value of 20.
 Use a loop to print all integers between the input value and 0, with the following exceptions:
 if the number is 6, instead print the string "six".
 Once the number is half of the input value, print "HALF!"
 7.b Run exercise 7.a again with a different input value and make sure it still works.
 You should also consider if it will work with a negative input, e.g. -20.
 */

int input = 20;
int inputB = 10;

for (int i = input; i >= 0 ; i --) {
 if (i==6) {
 println ("six");
 } else if (i == input/2) {
 println ("HALF!");
 } else {
 println(i);
 }
 }


//7.b
for (int i = inputB; i >= 0; i--) {
  if (i == 6) {
    println ("b: six");
  }else if (i == inputB/2) { 
    println(" b:HALF!");  
  } else {
  println("b: " + i);
  }
}

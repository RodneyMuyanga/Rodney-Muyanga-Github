/*4.d 
In the same loop (4.c) add a little detail: 
the numbers 3, 2 and 1, must be printed as words (3 == "Three").*/

int countdown = 20;


while (countdown > 0) { // Her får loop at vide, at det må kører hvis countdown variablen er større end 0.

    if (countdown == 3) { //hvis countdown når til 3, 2, 1 skal det skrives i bogstaver.
        println("Three");

    } else if (countdown == 2) {
        println("Two");

    } else if (countdown == 1) {
        println("One");
    } else {
        println("countdown: " + countdown); //Ellers skal den bare huske at printe countdown, og huske værdien.
    }
    countdown = countdown -1; // Her fortæller jeg at der skal trækkes en fra hver gang. 
}
println ("TAKE OFF!"); // når den er færdig med loopet, så må den printe takeoff. 

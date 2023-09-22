/*3.i Returning to the Datamatik tap, add a setup()
 function and in this function create a new object/instance of the
 type Teacher and give it the name, age and gender of your teacher.*/

void setup() //Da jeg har lavet en class, dannes der en datatype.
{


  Teacher Teacher1 = new Teacher("Rodney Muyanga", 32, false); //Objekt af klassen teacher
  Teacher Teacher2 = new Teacher("Melissa Olsen", 33, true);//Objekt af klassen teacher

  Student Student1 = new Student("Morten Larsen", 32, false, "Hold B");//Objekt af klassen student
  Student Student2 = new Student("Nina Jensen", 55, true, "Hold A");//Objekt af klassen student

  
  if (isClassmates(Student1, Student2)) {
    println("They are on the same team bro");
  } else {
    println("hell no");
  }
  println(Student1.name);
  println(Student1.datamatikerTeam);

  println(Student2.name);
  println(Student2.datamatikerTeam);



  Teacher1.changeName("Jonas");
  println(Teacher1.name);
}

boolean isClassmates(Student Student1, Student Student2)
{
  if (Student1.datamatikerTeam == Student2.datamatikerTeam)
  {
    return true;
  } else {
    return false;
  }
}

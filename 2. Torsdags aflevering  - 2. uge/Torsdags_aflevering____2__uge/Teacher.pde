/*3.f In the Teacher tab, declare the class
 "Teacher" and add 3 global variables: "name", "age", "isFemale",
 using appropriate data types for each.*/

class Teacher//her beskriver jeg hvad min lære er opbygget af. hvad behøver en lære.
{
  String name;
  int age;
  boolean isFemale;

  Teacher (String tmpName, int tmpAge, boolean tmpisFemale)//constructor (Den bygger objektet)
  {
    name = tmpName;
    age = tmpAge;
    isFemale = tmpisFemale;
  }

void changeName(String newName)
{
 this.name = newName; 
  }
}

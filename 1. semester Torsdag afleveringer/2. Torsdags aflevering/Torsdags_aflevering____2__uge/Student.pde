///*3.c In the Student tab, declare the class 
//"Student" and add 4 global variables: 
//"name", "age", "isFemale", "datamatikerTeam" 
//using appropriate data types for each.*/

//String name = "name";
//int age = "age";
//String isFemale = "isFemale";
//String datamatikerTeam = "datamatikerTeam";

class Student // class variables

{
  String name; 
  int age; 
  boolean isFemale;
  String datamatikerTeam;

  
  Student(String name, int age, boolean isFemale, String hold)//constructor (contructoren er public (tilgængelig for alt))
  {
    this.name = name;
    this.age = age;
    this.isFemale = isFemale;
    this.datamatikerTeam = hold;
  }
}

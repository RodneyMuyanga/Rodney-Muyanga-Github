package Task1;

public class Customer //Entity Class
{
    //Her har jeg 4 attributter/felter/instansvariabler.
    private String firstName;
    /*private attributer (encapsulation). Dette gør jeg for at instansvariablerne ikke er tilgængelige før jeg henter dem manuelt efter ønske.
    På denne måde blander felterne sig ikke med øvrige klasser. OGSÅ KALDET (DATAHIDE)*/
    private String lastName;
    private String username;
    private int id;

public Customer(String firstName, String lastName, String username, int id) //konstruktør bruges til at initialisere og oprette et nyt objekt. Nødvendigt for at bygge flere forskellige kunder.
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = id;

    }

    public String toString() //toString repræsentere et læstbart String af mit Objekt. Hvis ikke denne metode er i brug så laver compileren et "@" efterfulgt af noget tilfældigt.
    {
        return "Firstname: " + firstName + " Lastname: " + lastName + " Username: " + username + " Your Id: " + id;
    }

    //Setters:
    public void setFirstName(String newfirstName)
    {
        firstName = newfirstName;
    }
    public void setlastName(String newlastName)
    {
        lastName = newlastName;
    }
    public void setusername(String newusername)
    {
        username = newusername;
    }
    public void setid(int newid)
    {
        id = newid;
    }

    //Getters:
    public int getid()
    {
        return id;
    }
    public String getfirstName()
    {
        return firstName;
    }
    public String getlastName()
    {
        return lastName;
    }
    public String getusername()
    {
        return username;
    }

}
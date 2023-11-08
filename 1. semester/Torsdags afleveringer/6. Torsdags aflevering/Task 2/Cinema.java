package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats)
    {
        this.seats = new String[rows][seats];
        /* Her skulle variablen instantieres før vi tilgår Arrayen. Så jeg byttede om på disse to linjer.
        Her instantieres seats til en String matrix(dobbelt array).*/

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < seats; j++)
            {
              this.seats[i][j] = "seats";
            }
        }
        this.seats[0][0] = "Reseveret";
    }
    public int getRows()
    {
        return seats.length;
        /*vi skriver -1, fordi når man skriver ".length" så starter den med at tælle fra 1 og ikke "0" som en array altid gør.
        Så den vil altid tælle en for meget hvis ikke vi tilføjer "-1".*/
    } //Denne kode returnere antal rækker.

    public int getSeats()
    {
        return seats[0].length;
    }
    /*public int getSeats(int rowNumber)
    {
        return seats[rowNumber].length;
         //ved at indsætte int som en parameter i getmetoden, gør jeg koden mere variabel,
        // og kan derfor ændre numre, istedet for et hardcorded nummer.
    } //Denne kode returnere hvor mange der er på rækken.
    */

    // If the seat is not yet reserved, it's value is Seats.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) /*Der skal et nested for-loop til for at få denne kode til at virke.*/
    {
        if (seats[row][seat].equals("seats"))
            //hvis sædet er ledigt så resevere vi det.
        {
            seats[row][seat] = "X"; //vi resevere sædet.
            return true;
        }
        return false;
    }
    public boolean cancelReservation(int row, int seat)
    {
        if (seats[row][seat].equals("X")) //lille x lavede fejlen.
        {
            seats[row][seat] = "seats";
            return true;
        }
        return false;
    }
    public String toString()
    {
        String result = "";
        for (int i = 0; i < seats.length; i++) //række
        {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) //sæde nummer i rækken (i).
            {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}

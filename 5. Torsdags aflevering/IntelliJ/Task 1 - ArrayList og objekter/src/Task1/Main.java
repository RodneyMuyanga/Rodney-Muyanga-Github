package Task1;

import java.util.ArrayList;

public class Main { //client Class

    public static void main(String[] args) //Jeg har brugt en main metode, som man skal have for at køre nogle af sine koder.
    {
        ArrayList<Customer> Customers = new ArrayList<>(); // <> bruges til at bestemme hvilken klasse Arraylisten skal gemme.

        Customer customer1 = new Customer("Jens", "Mortensen", "JM93", 55);
        Customer customer2 = new Customer("Henna", "Upoi", "HU55", 810);
        Customer customer3 = new Customer("Micheal", "Petersen", "MMPP19", 65);
        Customer customer4 = new Customer("Peter", "Nymann", "Willy9000", 75);
        Customer customer5 = new Customer("Patrick", "Thomsen", "JeffTheCheff", 445);
        Customer customer6 = new Customer("Nanna", "Camillasen", "CamGirl22", 956);
        Customer customer7 = new Customer("Henriette", "Pedersen", "Hot123", 95);
        Customer customer8 = new Customer("Amanda", "Nielsen", "AmNi", 751);

        Customers.add(customer1);
        Customers.add(customer2);
        Customers.add(customer3);
        Customers.add(customer4);
        Customers.add(customer5);
        Customers.add(customer6);
        Customers.add(customer7);
        Customers.add(customer8);

        printCustomers(Customers);
    }
    public static void printCustomers(ArrayList<Customer> customers)
    {
        for (Customer customer : customers)
        {
            System.out.println(customer);
        }
    }
}
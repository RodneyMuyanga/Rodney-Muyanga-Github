public class Main
{
	public static void main(String[] args) 
	{
		footballTeam chelsea = new footballTeam("Chelsea",14,"Mykhaylo Mudryk",10);
		footballTeam manchesterUnited = new footballTeam("Manchester United",9,"Rasmus Højlund",11);
		footballTeam arsenal = new footballTeam("Arsenal",5,"Bukayo Saka",7);
		footballTeam manchesterCity = new footballTeam("Manceher City",1,"Erling Haaland",9);

		chelsea.setRank(14); //Nuværende placering i Primier League
        manchesterUnited.setRank(9); //Nuværende placering i Primier League
        arsenal.setRank(5); //Nuværende placering i Primier League
        manchesterCity.setRank(1); //Nuværende placering i Primier League

        System.out.println(chelsea);
        System.out.println(manchesterUnited);
        System.out.println(arsenal);
        System.out.println(manchesterCity);

	}	
}
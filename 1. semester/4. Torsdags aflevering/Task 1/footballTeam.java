public class footballTeam
{
	private String teamName;
	private int teamRank; //Holdet placering i Primier League
	private String teamPlayer;
	private int playerNumber; //Fodboldspillerens trøje nummer

	public footballTeam(String teamName,int teamRank, String teamPlayer,int playerNumber)
	{
		this.teamName = teamName;
		this.teamRank = teamRank;
		this.teamPlayer = teamPlayer;
		this.playerNumber = playerNumber;
	}

	public void setRank(int teamRank)
	{
		this.teamRank = teamRank;
	}
	public String toString() { //Dette laves istedet for get.
        return "Team: " + teamName + " Rank: " + teamRank + " Player: " + teamPlayer + " PlayerNumber: " + playerNumber;
    }
}
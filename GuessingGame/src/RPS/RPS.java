package RPS;

public class RPS {
	private String rock = "Rock";
	private String paper = "Paper";
	private String scissors = "Scissors";
		
	public String Rock()
	{
		System.out.println("You have chosen rock, much like the actor");
		return rock;
	}	
	
	public String Paper()
	{
		System.out.println("You chose paper, floating through the wind");
		return paper;
	}
	
	public String Scissors()
	{
		System.out.println("You chose Scissors, please don't run with these");
		return scissors;
	}
}
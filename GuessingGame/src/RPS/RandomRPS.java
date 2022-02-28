package RPS;

import java.util.Random;

public class RandomRPS extends RPS{

	public static String ComputerChoice()
	{
		String[] rpsArr = {"Rock", "Paper", "Scissors"};
		Random rand = new Random();
		String str = null;

		str = rpsArr[rand.nextInt(rpsArr.length)];
		return str;
	}
}
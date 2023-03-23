package package1;

import java.util.Scanner;

class Guesser
{
	int GuessNum;
	
	int GuessNum()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Guesser kindly guess the Number");
	GuessNum=scan.nextInt();
	return GuessNum;
	}
}
class Player
{
	int GuessNum;
	
	int GuessNum()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Player kindly guess the Number");
	GuessNum=scan.nextInt();
	return GuessNum;
	}	
}
class Empire
{
	int NumFromGuesser;
	int NumFromPlay1;
	int NumFromPlay2;
	int NumFromPlay3;
	
	void collectNumFromGuesser()
	{
		Guesser G=new Guesser();
		NumFromGuesser=G.GuessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		NumFromPlay1=p1.GuessNum();
		NumFromPlay2=p2.GuessNum();
		NumFromPlay3=p3.GuessNum();
	}
	void Compare()
	{
		if(NumFromGuesser==NumFromPlay1)
		{
			if(NumFromGuesser==NumFromPlay2 && NumFromGuesser==NumFromPlay3)
			{
				System.out.println("All players Won the Game");
			}
			else if(NumFromGuesser==NumFromPlay2)
			{
				System.out.println("Players 1&2 Won the game");
			}
			else if(NumFromGuesser==NumFromPlay3)
			{
				System.out.println("Players 1&3 Won the game");
			}
			else
			{
			System.out.println("Player1 Won the Game");
			}
		}
		else if(NumFromGuesser==NumFromPlay2)
		{
			if(NumFromGuesser==NumFromPlay3)
			{
			System.out.println("Player 2&3 Won the Game");
			}
			else
			{
				System.out.println("Player 2 won the Game");
			}
		}
		else if(NumFromGuesser==NumFromPlay3)
		{
			System.out.println("Player3 Won the Game");
		}
		else
		{
			System.out.println("Try Again");
		}
	}
}








public class Guesser_game {

	public static void main(String[] args) {
		
		Empire E=new Empire();
		E.collectNumFromGuesser();
		E.collectNumFromPlayers();
		E.Compare();
	}

}

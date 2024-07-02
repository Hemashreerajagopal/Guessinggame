package guessgame;

class competitor
{
	int number;
	public void guess()
	{
		number=(int)(Math.random()*10);
	}
}
class Game
{
	competitor c1;
	competitor c2;
	competitor c3;
	void startGame()
	{
		c1 = new competitor();
		c2 = new competitor();
		c3 = new competitor();
		
		int guessc1;
		int guessc2;
		int guessc3;
		
		boolean c1isRight=false;
		boolean c2isRight=false;
		boolean c3isRight=false;
		
		int target = (int)(Math.random()*10);
		System.out.println("I am thinking of a number between 5 to 10");
		while(true)
		{
			System.out.println("Number to be Guessed : "+target);
			c1.guess();
			c2.guess();
			c3.guess();
			guessc1=c1.number;
			System.out.println("competitor One Guess : "+guessc1);
			guessc2=c2.number;
			System.out.println("competitor Two Guess : "+guessc2);
			guessc3=c3.number;
			System.out.println("competitor Three Guess : "+guessc3);
			if(target==guessc1)
				c1isRight=true;
			if(target==guessc2)
				c2isRight=true;
			if(target==guessc3)
				c3isRight=true;
			
			if(c1isRight || c2isRight || c3isRight)
			{
				System.out.println("We have a Winner...!!!");
				System.out.println("competitor one got it right ? "+c1isRight);
				System.out.println("competitor Two got it right ? "+c2isRight);
				System.out.println("competitor Three got it right ? "+c3isRight);
				System.out.println("Game Over");
				break;
			}
			else
			{
				System.out.println("competitor will have to try Again");
			}
		}
	}
	
}

public class GuessingGame {

	public static void main(String[] args) {
		Game game=new Game();
		game.startGame();

	}

}

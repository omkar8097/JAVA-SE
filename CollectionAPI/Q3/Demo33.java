package Q3;




interface Game 
{
	 void play();
	 
}

class cric implements Game
{
	public void play()
	 {
		System.out.println("cric"); 
	 }
}

class ten implements Game
{
	public void play()
	 {
		System.out.println("ten"); 
	 }
}

class tt implements Game
{
	public void play()
	 {
		System.out.println("tt"); 
	 }
}


class ss  <T extends Game >
{
   
	public void perform (T game)
	{
		game.play();
	}

}
public class Demo33 {
	
	public static void main(String[] args) 
	{
		ss s =new ss();
		s.perform(new tt());
		
		
	}
	
	

}

class  Engine
{
	void start()	 
	{
		System.out.println("Engine Started");
	}
}

class MusicPlayer
{
	void music()
	{
		System.out.println("MusicPlayer is on...");
	}
}

class Car
{
	Engine e1 = new Engine();
	
	Car()
	{
		System.out.println("Car (Fortuner) Manufactured");
		e1.start();
	}
	
	Car(MusicPlayer player1)
	{
		System.out.println("Car (BMW M5CS) Manufactured");
		e1.start();
		player1.music();
	}
}

class Factory
{
	public static void main(String[] args)
	{
		Car c1 = new Car();
		
		MusicPlayer player1 = new MusicPlayer();
		Car c2 = new Car(player1);
	}
	
}
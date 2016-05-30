package Games;
import Games.Stadium;
import Games.Runner;
public class TheRun {
	Stadium stadium = new Stadium();
	Runner runner = new Runner();
	public void Start(){
		int countRunner = stadium.CountRunners;
		System.out.println("Добро пожаловать на TheRun, сегодня в нем будет участвовать "+countRunner+" человек.");
		int weather = stadium.Weather;
		if(weather == 1){
			System.out.println("Погода сегодня отличная");
			System.out.println("Побежит ли наш завсегдатый "+runner.RunnerName+"?");
		}else{
			System.out.println("Погода к сожалению не радует =(");
			System.out.println("Побежит ли наш завсегдатый "+runner.RunnerName+"?");
		}
		if(runner.GetRun(weather) == true){
			System.out.println("Это хорошая новость, давайте начнем!");
			Run(countRunner);			
		}else{
			System.out.println("Ну и пошел ты!");
		}
		
	}
	public void Run(int countRunner){
		int maxSpeed = 0;
		for(int i = 0; i < countRunner; i++){
			int RunnerSpeed = runner.RunnerSpeed();
			if(maxSpeed < RunnerSpeed){
				maxSpeed = RunnerSpeed;
			}
		}
		int MySpeed = runner.MySpeed;
		if(MySpeed > maxSpeed){
			System.out.println("Ура, победителе TheRun стал "+runner.RunnerName+". Его скорость: "+MySpeed+", а скорость ближайшего к нему: "+maxSpeed);
		}else{
			System.out.println("Увы, "+runner.RunnerName+", вы опозорились. Ваша скорость: "+MySpeed+", а скорость самого быстрого: "+maxSpeed);
		}
	}
}

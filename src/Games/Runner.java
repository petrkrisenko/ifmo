package Games;
import Games.Stadium;
public class Runner {
	Stadium stadium = new Stadium();
	public String RunnerName = "Петр";
	public int MySpeed = (int) (10+(Math.random()*20-10));
	public int health = (int) (1+(Math.random()*2)-1);
	public boolean GetRun(int weather){
		int distance = stadium.Distance; 
		if(weather == 1){
			if(health == 1){
				System.out.println(RunnerName+": Да, погода отличная, какая дистанция?");
				if(distance > 56){
					System.out.println(RunnerName+": "+distance + " км? Не сегодня");
					return false;
				}else{
					System.out.println(RunnerName+": "+distance + " км? Давайте сделаем это!!!!");
					return true;
				}
			}else{
				System.out.println(RunnerName+": Погода отличная, но у меня похмелье, так что нет..");
				return false;
			}
		}else{
			System.out.println(RunnerName+": Урод, ты погоду видел, дай поспать, сам беги свой кросс!");
			return false;
		}
	}
	public int RunnerSpeed(){
		return (int) (10+(Math.random()*15-10));
	}
}

package Games;
import Games.Stadium;
public class Runner {
	Stadium stadium = new Stadium();
	public String RunnerName = "����";
	public int MySpeed = (int) (10+(Math.random()*20-10));
	public int health = (int) (1+(Math.random()*2)-1);
	public boolean GetRun(int weather){
		int distance = stadium.Distance; 
		if(weather == 1){
			if(health == 1){
				System.out.println(RunnerName+": ��, ������ ��������, ����� ���������?");
				if(distance > 56){
					System.out.println(RunnerName+": "+distance + " ��? �� �������");
					return false;
				}else{
					System.out.println(RunnerName+": "+distance + " ��? ������� ������� ���!!!!");
					return true;
				}
			}else{
				System.out.println(RunnerName+": ������ ��������, �� � ���� ��������, ��� ��� ���..");
				return false;
			}
		}else{
			System.out.println(RunnerName+": ����, �� ������ �����, ��� �������, ��� ���� ���� �����!");
			return false;
		}
	}
	public int RunnerSpeed(){
		return (int) (10+(Math.random()*15-10));
	}
}

package Games;
import Games.Stadium;
import Games.Runner;
public class TheRun {
	Stadium stadium = new Stadium();
	Runner runner = new Runner();
	public void Start(){
		int countRunner = stadium.CountRunners;
		System.out.println("����� ���������� �� TheRun, ������� � ��� ����� ����������� "+countRunner+" �������.");
		int weather = stadium.Weather;
		if(weather == 1){
			System.out.println("������ ������� ��������");
			System.out.println("������� �� ��� ����������� "+runner.RunnerName+"?");
		}else{
			System.out.println("������ � ��������� �� ������ =(");
			System.out.println("������� �� ��� ����������� "+runner.RunnerName+"?");
		}
		if(runner.GetRun(weather) == true){
			System.out.println("��� ������� �������, ������� ������!");
			Run(countRunner);			
		}else{
			System.out.println("�� � ����� ��!");
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
			System.out.println("���, ���������� TheRun ���� "+runner.RunnerName+". ��� ��������: "+MySpeed+", � �������� ���������� � ����: "+maxSpeed);
		}else{
			System.out.println("���, "+runner.RunnerName+", �� �����������. ���� ��������: "+MySpeed+", � �������� ������ ��������: "+maxSpeed);
		}
	}
}

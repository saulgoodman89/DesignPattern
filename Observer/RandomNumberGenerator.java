import java.util.Random;
/*
	ConcreteSubject(구체적인 관찰 대상자)의 역활. 
	관찰되는 대상을 표현하는 역활. 
	상태가 변화하면 등록되어 있는 observer에 전한다. 
*/
public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();
	private int number;
	public int getNumber() {
		return number;
	}
	public void execute() {
		for(int i=0; i<20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}

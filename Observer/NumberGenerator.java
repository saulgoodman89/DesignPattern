/*
	수를 생성하는 추상 클래스.
	Subject(관찰 대상자) 역활을 한다. 
	Observer를 등록 / 헤제 하고 현재 상태를 취득한다. 
*/
import java.util.ArrayList;
import java.util.Iterator;
public abstract class NumberGenerator {
	private ArrayList observers = new ArrayList();
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator it = observers.iterator();

		while (it.hasNext()) {
			Observer o = (Observer)it.next();
			o.update(this);
		}
	}

	public abstract int getNumber();
	public abstract void execute();

}

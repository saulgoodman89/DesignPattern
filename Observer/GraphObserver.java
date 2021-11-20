/*
	구체적인 Observer 
	update가 노출되면 , Subject 역활의 현재 상태를 취득. 

*/
public class GraphObserver implements Observer {
	public void update(NumberGenerator generator) {
		int count = generator.getNumber();
		for(int i=0; i<count; i++) {
			System.out.print("*");
		}

		System.out.println("");
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			
		}
	
	}

}

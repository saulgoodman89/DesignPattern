/*
	Subject로 부터 "상태가 변했습니다." 라고 전달받는 역활. 
*/
public interface Observer {
	public abstract void update(NumberGenerator generator);
}

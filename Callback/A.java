public class A {
	private CustomListener listener;
	public A(CustomListener customListener) {
		super();
		this.listener = customListener;
	}

	public void start() {
		result();
	}

	public void result() {
		if(listener != null) {
			listener.callBack("Hellow World");
		}
	}

}

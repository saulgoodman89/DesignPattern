public class ChairDisplay extends AbstractDisplay { 
	private char ch;
	public ChairDisplay(char ch){
		this.ch = ch;
	}

	public void open() {
		System.out.print("<<");
	}

	public void print() {
		System.out.print(ch);
	}

	public void close() {
		System.out.println(">>");
	}

}

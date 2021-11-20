public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		System.out.println("Main.java / init Factory");

		Product card1 = factory.create("홍길동");
		System.out.println("Main.java / Call Product card1");
		card1.use();

		Product card2 = factory.create("이순신");
		System.out.println("Main.java / Call Product card2");
		card2.use();

		Product card3 = factory.create("강감찬");
		System.out.println("Main.java / Call Product card3");
		card3.use();

	}

}

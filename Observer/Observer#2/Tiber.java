package Observer#2;

public class Tiber implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("Tiber 수신 : "+ msg);
    }
}

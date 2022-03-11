package Observer#2;

public class Baedi implements Coach {
    private List<Crew> crews = new ArrayList<>();

    public void eatFood() {
        System.out.println("코치가 밥먹는다.");
        notifyCrew("나 밥먹었어");
    }

    public void runaway() {
        System.out.println("코치가 농땡이를 친다");
        notifyCrew("나 농땡이 쳤다");
    }

    public void upgradeCutie() {
        System.out.println("귀여움 강화");
        notifyCrew("나 귀여워짐");
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }
    
}

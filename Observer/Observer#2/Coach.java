package Observer#2;

public interface Coach {
    void subscribe(Crew crew);
    void unsubscribe(Crew crew);
    void notifyCrew(String msg);
    
}

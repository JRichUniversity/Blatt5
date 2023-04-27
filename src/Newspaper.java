import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class Newspaper implements Source, Reciever{
    int max_sub;
    List<Reciever> subscriber = new ArrayList<>();

    Newspaper(int ms) {
        max_sub = ms;
    }

    public void subscribe(Reciever reciever){
        if (subscriber.size() == max_sub){
            throw new SubscriptionFullException("Subscription failed. Maximum amount of subscribers reached: " + max_sub);
        }
        subscriber.add(reciever);
    }
}

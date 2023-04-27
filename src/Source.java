import java.util.ArrayList;
import java.util.List;

public interface Source {
    List<Reciever> subscriber = new ArrayList<>();
    default void send(String text){
        for(Reciever sub : subscriber){
            sub.recieve(text);
        }
    }

    default void subscribe(Reciever reciever){

    }

    default void sendAlert(String text){
        this.send(text.toUpperCase());
    }
}


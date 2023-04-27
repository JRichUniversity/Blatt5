import java.util.ArrayList;
import java.util.List;

public interface Reciever {
    List<String> newsToCheck = new ArrayList<>();

    default void recieve(String text){
        newsToCheck.add(text);
    }

    default String recieveAlert(String text){
        recieve(text);
        return text;
    }
}

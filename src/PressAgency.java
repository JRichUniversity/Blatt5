import java.util.ArrayList;
import java.util.List;

public class PressAgency implements Source{
    List<Newspaper> newspapers= new ArrayList<>();

    public void send(String text) {
        for(Newspaper news : newspapers){
            send("Agentur Meldung! " + text);
        }
    }
}

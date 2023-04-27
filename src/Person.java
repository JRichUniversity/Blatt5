import java.util.*;

public class Person implements Reciever{
    void checkAllNews(){
        for(String str : newsToCheck.toArray(new String[0])){
            System.out.println(str);
        }
        newsToCheck.clear();
    }
}

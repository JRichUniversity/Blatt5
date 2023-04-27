import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    final static double prec = 0.00000001;

    @Test(expected = RuntimeException.class)
    public void test(){
        Newspaper news = new Newspaper(2);
        news.subscribe(new Person());
        news.subscribe(new Person());
        news.subscribe(new Person());
    }

    @Test
    public void sizeTest(){
        Newspaper news2 = new Newspaper(10);
        Person p1 = new Person();
        Person p2 = new Person();
        news2.subscribe(p1);
        news2.subscribe(p2);
        for(Object obj : news2.subscriber.toArray())
        {
            System.out.println(obj);
        }
        assertEquals(news2.subscriber.toArray().length, 2);
    }

    @Test
    public void alertTest(){
        Person p1 = new Person();
        assertEquals(p1.recieveAlert("hallo tsunami gefahr wallah".toUpperCase()), "HALLO TSUNAMI GEFAHR WALLAH");
    }
}
